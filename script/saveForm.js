function saveForm() {
    console.log('1+++++');

     // Get the data from each element on the form.
    const firstName = document.forms.infor.fname.value;
    
    // This variable stores all the data.
    let data = 
        '\r Name: ' + firstName + ' \r\n ';
    
    // Convert the text to BLOB.
    const textToBLOB = new Blob([data], { type: 'text/plain' });
    const sFileName = 'formData.txt';	   // The file to save the data.

    let newLink = document.createElement("a");
    newLink.download = sFileName;

    if (window.webkitURL != null) {
        newLink.href = window.webkitURL.createObjectURL(textToBLOB);
    }
    else {
        newLink.href = window.URL.createObjectURL(textToBLOB);
        newLink.style.display = "none";
        document.body.appendChild(newLink);
    }

    newLink.click(); 
}

function submit() {
    console.log('2+++++');

    // const firstName = document.getElementById("fname").innerHTML;

    // console.log('++++', firstName);
}