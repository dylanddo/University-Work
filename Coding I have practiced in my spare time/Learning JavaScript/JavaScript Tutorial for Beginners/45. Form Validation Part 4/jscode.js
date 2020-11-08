function validateTextbox()
{
    var box = document.getElementById("name");  // Allows us to get a hold of the text box.
    var box2 = document.getElementById("address");

    // .value gets us the value inside the box
    // box.value.length < 5 forces the user to enter at least 5 characters.

    if(box.value.length < 5 || box2.value.length < 5) 
    {
        alert("Please enter at least 5 characters");   // Stops form from being submitted if there are less than 5 characters entered.
        // Despite this alert box the form is still submitted.
        
        box.focus();
        box.style.border = "solid 3px red";

        return false;   // This prevents the form from being submitted.
    }

}