$(document).ready(function() {
    $('.del-course').on('click', function() {
        $('myModal').modal();
        var title = $(this).data('title');
        $('#delete-title').val(title);
    });

    $('.del-deck').on('click', function() {
        $('myModal').modal();
        var title = $(this).data('title');
        console.log(title);
        $('#delete-title').val(title);
    });

    $('.del-card').on('click', function() {
        $('myModal').modal();
        var id = $(this).data('id');
        console.log(id);
        $('#delete-id').val(id);
    });

    $('#insert-list').on('click', function() {
        $('#answer-box').insertAtCaret('<ul>\n' +
            '<li></li>\n' +
            '<li></li>\n' +
            '<li></li>\n' +
            '<li></li>\n' +
            '</ul>\n');
    });

    $('#insert-code').on('click', function() {
        $('#answer-box').insertAtCaret("<pre></pre>");
    });
});

/*Plugin definition*/
jQuery.fn.extend({
    insertAtCaret: function(myValue){
        return this.each(function(i) {
            if (document.selection) {
                this.focus();
                sel = document.selection.createRange();
                sel.text = myValue;
                this.focus();
            }
            else if (this.selectionStart || this.selectionStart == '0') {
                var startPos = this.selectionStart;
                var endPos = this.selectionEnd;
                var scrollTop = this.scrollTop;
                this.value = this.value.substring(0, startPos)+myValue+this.value.substring(endPos,this.value.length);
                this.focus();
                this.selectionStart = startPos + myValue.length;
                this.selectionEnd = startPos + myValue.length;
                this.scrollTop = scrollTop;
            } else {
                this.value += myValue;
                this.focus();
            }
        })
    }
});