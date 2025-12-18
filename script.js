document.addEventListener('DOMContentLoaded', function() {
    const marginSlider = document.getElementById('margin');
    const borderSlider = document.getElementById('border');
    const paddingSlider = document.getElementById('padding');
    const boxExample = document.querySelector('.box-model-example');
    const marginValue = document.getElementById('margin-value');
    const borderValue = document.getElementById('border-value');
    const paddingValue = document.getElementById('padding-value');
    function updateBox() {
        const margin = marginSlider.value + 'px';
        const border = borderSlider.value + 'px';
        const padding = paddingSlider.value + 'px';
        marginValue.textContent = margin;
        borderValue.textContent = border;
        paddingValue.textContent = padding;
        boxExample.style.margin = margin;
        boxExample.style.borderWidth = border;
        boxExample.style.padding = padding;
    }
    marginSlider.addEventListener('input', updateBox);
    borderSlider.addEventListener('input', updateBox);
    paddingSlider.addEventListener('input', updateBox);
    updateBox();
});
