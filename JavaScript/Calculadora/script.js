function appndToDisplay(value) {
    document.getElementById("display").value += value;
}

function calculate() {
    try {
        document.getElementById("display").value = eval(
            document.getElementById("display").value
        )
    } catch (err) {
        document.getElementById("display").value = "Error";
    }
}

function clearDisplay() {
    document.getElementById("display").value = "";
}

function backspace() {
    var displayValue = document.document.getElementById("display").value;
    document.getElementById("display").value = displayValue.substring(
        0, displayValue.length - 1
        );
}