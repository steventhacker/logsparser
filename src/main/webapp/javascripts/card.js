$(document).ready(function() {

    $('#toggleAnswer').on('click', function() {
        if ($('#answer').hasClass('hidden')) {
            $('#answer').removeClass('hidden');
        } else {
            $('#answer').addClass('hidden');
        }
    });

    $('.delete-button').on('click', function() {
        var id = $(this).data('id');
        console.log(id);
        $('#deleteId').val(id);
    });
});