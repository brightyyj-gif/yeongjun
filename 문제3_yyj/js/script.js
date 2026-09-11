$(function(){
    // 1. dd를 숨겨라
    $('dd').hide();


    // 2. dd중 첫번째를 보여라
    $('dd').eq(0).show();

    // 3. dt중 첫번째 dt addClass('selected') 해보기
    $('dt').eq(0).addClass('selected');

    // 4. dl dt 클릭하면 (아코디언이 되게)
    $('dl dt').click(function(){
        var status = $(this).next('dd').css('display');
        if(status == 'none'){
            $('dd').slideUp('slow');
            $(this).next().slideDown('slow');
            $('dl dt').removeClass('selected');
            $(this).addClass('selected');
        }
    });

    // 5. dl dt 마우스오버 하면 this addClass 'over'
    $('dl dt').mouseover(function(){
        $(this).addClass('over'); // 흐린 회색 배경 넣기
    });

    // 6. dl dt 마우스아웃 하면 this removeClass 'over'
    $('dl dt').mouseout(function(){
        $(this).removeClass('over'); // 흐린 회색 배경 빼기
    });

});