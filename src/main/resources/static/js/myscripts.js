



function myFunction() {
    var x = document.getElementById("dropdown-content");
    if (x.style.display === "block") {
        x.style.display = "none";
    } else {
        x.style.display = "block";
    }
}


function modalopen() {
    document.getElementById("myModal").style.display = "block"
}

function modalclose() {
    document.getElementById("myModal").style.display = "none"
}


function valideer() {
    var pass1 = document.getElementById("AddPaswoord").value
    var pass2 = document.getElementById("AddPaswoord2").value
    var x = document.getElementById("submitbutton")
    var y = document.getElementById("errorMessage")
    var y2 = document.getElementById("errorMessage2")
    var y3 = document.getElementById("valideerbutoon")


    if (pass1 === "" || pass2 === "") {
        y2.style.display = "block"
        y.style.display = "none"
    } else if (pass1 !== pass2) {
        y.style.display = "block"
        y2.style.display = "none"
    } else {
        y2.style.display = "none"
        y.style.display = "none"
        x.style.display = "block"
        y3.style.display = "none"

    }


}
