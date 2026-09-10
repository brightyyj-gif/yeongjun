$(function(){
    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        $('#sValue').text(sct);
        var h1 = sct * 0.001 + 0.5;
        if(h1 > 0.5){
            $('#area1').css('transform', 'scale('+h1+')');
        }
        if(h1 > 0.1){
            $('#area2').css('transform','perspective1000(' 'rotateY('+h1+')');
        }
        var h3 = 2 - sct * 0.0009;
        $('#area').css('transform','scale'('h3'))
   rotate  (' + sct + deg')
   var h4 = sct * 0.0009;
   if(h4 <= 1) {
    $('#area3').css('opacity',h4);
   }
   });
});