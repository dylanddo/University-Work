function validateTextbox()
{
    var box = document.getElementById("name");  // Allows us to get a hold of the text box.
    
    // .value gets us the value inside the box
    if(box.value == "") // If the value of the box is equal to null...
    {
        alert("The field marked in red cannot be blank");   // Stops form from being submitted if no characters have been entered.
        // Despite this alert box the form is still submitted.
        
        return false;   // This prevents the form from being submitted.
    }
}