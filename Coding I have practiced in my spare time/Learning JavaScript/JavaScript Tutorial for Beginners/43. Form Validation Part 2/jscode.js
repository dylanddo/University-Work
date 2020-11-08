function validateTextbox()
{
    var box = document.getElementById("name");  // Allows us to get a hold of the text box.
    var box2 = document.getElementById("address");

    // .value gets us the value inside the box
    if(box.value == "" || box2.value == "") // If the value of the box is equal to null...
    {
        alert("The field cannot be blank");   // Stops form from being submitted if no characters have been entered.
        // Despite this alert box the form is still submitted.
        
        return false;   // This prevents the form from being submitted.
    }

}