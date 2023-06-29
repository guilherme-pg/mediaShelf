
document.addEventListener("DOMContentLoaded", function() {

    const radioInputs = document.querySelectorAll('input[name="option_media"]');
    const forms = document.querySelectorAll('.form_inputs');

    // Add event listeners to radio inputs
    radioInputs.forEach(function(radio) {
        radio.addEventListener("change", function() {
            // Get the value of the selected radio input
            const selectedValue = this.value;

            // Hide all forms
            forms.forEach(function(form) {
                form.classList.add("hidden");
            });

            // Display the corresponding form
            const selectedForm = document.getElementById(selectedValue);
            selectedForm.classList.remove("hidden");
        });
    });
});