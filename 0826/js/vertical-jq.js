$(function(){
    //$('.m_menu li ul').css('display','none');
    $('.sub').hide();
    //$('.sub').css('display','none');

    //.sub중 첫번째 것만 보여라
     $('.sub').eq(0).show();

    //$('.m_menu li:nth-child(1) ul').css('display','block');
    //$('.m_menu li:nth-child(1) ul').show();
    //$('.m_menu li:eq(0) ul').show();
    //$('.m_menu li:first ul').show();

    $('.m_menu>li>a').click(function(e){
        e.preventDefault(); //a 링크금지 , 스크롤 위로 올라가는거 방지

       var status = $(this).next('.sub').css('display');
        //alert(status);
        //클릭한 a 태그 다음에 있는 요소중 클래스 sub인 요소의 display 속성값을 
        // 가져옴  block/none 상태를 status에 저장

        if(status == 'none'){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();
        }else{
            $('.sub').slideUp();
        }


        //return false;
    });

});