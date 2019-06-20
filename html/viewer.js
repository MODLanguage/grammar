'use strict';

let rowCount = 1;

//
// Load a tests file chosen by the user - the file must conform to the format of base_tests.json in the tests directory of the grammar repo
//
function loadFile() {
    let input, file, fr;

    if (typeof window.FileReader !== 'function') {
        alert("The file API isn't supported on this browser yet.");
        return;
    }

    input = document.getElementById('fileinput');
    if (!input) {
        alert("Um, couldn't find the fileinput element.");
    } else if (!input.files) {
        alert("This browser doesn't seem to support the `files` property of file inputs.");
    } else if (!input.files[0]) {
        alert("Please select a file before clicking 'Load'");
    } else {
        file = input.files[0];
        fr = new FileReader();
        fr.onload = receivedText;
        fr.readAsText(file);
    }

    //
    // Parse the loaded file and update the HTML to display the list of tests.
    //
    function receivedText(e) {
        let lines = e.target.result;
        let json = JSON.parse(lines);
        let txt = '';

        txt += "<div class='test-list'>";
        txt += "<div class='row'>";
        txt += "<div class='col-xs-12'>";

        let count = 1;
        let x = undefined;

        for (x in json) {

            let i = json[x].input;
            let id = json[x].id;
            let e = '';
            let m = json[x].minimised_modl;
            try {
                e = JSON.stringify(JSON.parse(json[x].expected_output), null, 4);
            } catch (err) {
                e = json[x].expected_output;
            }
            let f = json[x].tested_features;

            txt += createRow(id, i, m, e, f);
            count += 1;
        }
        txt += "</div>";
        txt += "</div>";
        txt += "</div>";
        document.getElementById("json-data").innerHTML = txt;
        rowCount = count;
        makeEditable();
    }
}

function makeEditable() {
    for (let count = 1; count <= rowCount; count++) {
        $('#testInput' + count).editable({rows: 20, placement: 'bottom', defaultValue: 'null', emptytext: ''});
        $('#expected' + count).editable({rows: 20, placement: 'bottom', defaultValue: 'null', emptytext: ''});
        $('#minimisedModl' + count).editable({
            rows: 10,
            placement: 'bottom',
            defaultValue: 'null',
            emptytext: ''
        });
        $('#testedFeatures' + count).editable({
            rows: 5,
            placement: 'bottom',
            defaultValue: 'null',
            emptytext: ''
        });
    }
}

//
// Save the supplied data to the given fileName
//
function saveData(data, fileName) {
    let a = document.createElement("a");
    document.body.appendChild(a);
    a.style = "display: none";

    let blob = new Blob([data], {type: "text/json;charset=utf-8"});
    let url = window.URL.createObjectURL(blob);
    a.href = url;
    a.download = fileName;
    a.click();
    window.URL.revokeObjectURL(url);

}

//
// Add an event listener for the Save button.
//
function main() {
    let savefile = document.getElementById("savefile")
    savefile.addEventListener("click", saveFile, false)
}

//
// Parse the HTML to extract the list of tests.
// Return the result as a JSON string.
//
function getSaveData() {
    let result = [];

    let items = $('.testDataRow');
    $.each(items, function (i, v) {
        let id = v.children[0].innerText;
        let input = v.children[1].innerText;
        let minimised_modl = v.children[2].innerText;
        let expected = v.children[3].innerText;
        let testedFeatures = v.children[4].innerText;

        let f = [];

        if (testedFeatures.includes(',')) {
            let parts = testedFeatures.split(',');
            parts.forEach(p => f.push(p));
        } else {
            f.push(testedFeatures);
        }

        result.push({
            id: id,
            input: input,
            expected_output: expected,
            tested_features: f,
            minimised_modl: minimised_modl
        });
    });

    return JSON.stringify(result, false, 4);
}

//
// Get the test data and save the file
//
function saveFile(e) {
    saveData(getSaveData(), "base_tests.json");
    e.preventDefault()
}

//
// Add a row to the end of the list
//
function addRow() {
    let txt = document.getElementById("json-data").innerHTML;
    txt += createRow(rowCount, 'ChangeMe', 'ChangeMe', 'ChangeMe', 'ChangeMe');
    document.getElementById("json-data").innerHTML = txt;
    rowCount += 1;
    makeEditable();
    let panel = $('#json-panel');
    panel.scrollTop(panel[0].scrollHeight)
}

//
// Return the text of a new row.
//
function createRow(rowNumber, input, minified, result, features) {

    let txt = '';

    txt += '<div id="dataRow' + rowNumber + '" class="testDataRow row table-bordered table-condensed">';
    txt += '<div id="testID' + rowNumber + '" class="col-xs-1 border border-dark">' + rowNumber + '</div>';
    // input editor
    txt += '<div class="col-xs-3 border border-dark">';
    txt += '<a href="#" id="testInput' + rowNumber + '" data-type="textarea" data-pk="1" data-placeholder="Test input..." data-title="Enter test input" class="editable editable-pre-wrapped editable-click" data-original-title="" title="" style="background-color: rgba(0, 0, 0, 0);">';
    txt += input;
    txt += '</a>';
    txt += '</div>';

    txt += '<div class="col-xs-3 border border-dark">';
    txt += '<a href="#" id="minimisedModl' + rowNumber + '" data-type="textarea" data-pk="1" data-placeholder="Test input..." data-title="Enter minimised test input" class="editable editable-pre-wrapped editable-click" data-original-title="" title="" style="background-color: rgba(0, 0, 0, 0);">';
    txt += minified;
    txt += '</a>';
    txt += '</div>';


    txt += '<div class="col-xs-3 border border-dark"><pre>';
    txt += '<a href="#" id="expected' + rowNumber + '" data-type="textarea" data-pk="1" data-placeholder="Expected output..." data-title="Enter expected output" class="editable editable-pre-wrapped editable-click" data-original-title="" title="" style="background-color: rgba(0, 0, 0, 0);">';
    txt += result;
    txt += '</a>';
    txt += '</pre></div>';
    txt += '<div class="col-xs-1 border border-dark">';
    txt += '<a href="#" id="testedFeatures' + rowNumber + '" data-type="textarea" data-pk="1" data-placeholder="Features..." data-title="Enter tested features" class="editable editable-pre-wrapped editable-click" data-original-title="" title="" style="background-color: rgba(0, 0, 0, 0);">';
    txt += features;
    txt += '</a>';
    txt += '</div>';

    txt += '<div class="col-xs-1">';
    txt += '<div id="delete' + rowNumber + '" class=\'btn btn-sm btn-danger\' onclick="deleteRow(' + rowNumber + ')"><span class="glyphicon glyphicon-trash"></span></div>';
    txt += '</div>';

    txt += '</div>';

    return txt;
}

//
// Delete a row
//
function deleteRow(row) {
    let v = $('#dataRow' + row);

    v.children()[1].innerText = 'DELETED';
    v.children()[2].innerText = 'DELETED';
    v.children()[3].innerText = 'DELETED';
    v.children()[4].innerText = 'DELETED';

    makeEditable();
}
