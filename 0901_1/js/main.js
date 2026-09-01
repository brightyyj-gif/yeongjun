$(function(){

    var off_1 = $('#section1').offset().top;
    var off_2 = $('#section2').offset().top;
    var off_3 = $('#section3').offset().top;
    var off_4 = $('#section4').offset().top;
    var off_5 = $('#section5').offset().top;
    console.log(off_1, off_2, off_3,off_4,off_5)
    var of_1 = $('#wrap > section').eq(0).offset().top;
    var of_2 = $('#wrap > section').eq(1).offset().top;
    var of_3 = $('#wrap > section').eq(2).offset().top;
    //alert(of_3);
    //화면에 스크롤시
   
    //오른쪽 #float_div
        var f_top = $('#float_div').offset().top;
        // alert(f_top);250
    $(window).scroll(function(){
       var sct = $(window).scrollTop();
       //console.log(sct); 
        $('.s_Top').text(sct);
        if(sct > 50){
            $('nav').addClass('fixed');
        }else{
             $('nav').removeClass('fixed');
        }

        if(sct >= $('#wrap>section').eq(0).offset().top){
           $('nav ul li').removeClass('on');
           $('nav ul li').eq(0).addClass('on');
        }
         if(sct >= $('#wrap>section').eq(1).offset().top){
           $('nav ul li').removeClass('on');
           $('nav ul li').eq(1).addClass('on');
        }

         if(sct >= $('#wrap>section').eq(2).offset().top){
           $('nav ul li').removeClass('on');
           $('nav ul li').eq(2).addClass('on');
        }

         if(sct >= $('#wrap>section').eq(3).offset().top){
           $('nav ul li').removeClass('on');
           $('nav ul li').eq(3).addClass('on');
        }

         if(sct >= $('#wrap>section').eq(4).offset().top){
           $('nav ul li').removeClass('on');
           $('nav ul li').eq(4).addClass('on');
        }

        
        $('#float_div').stop().animate({top:f_top + sct},300);

    });

    $('nav ul li').click(function(){
         var i  =  $(this).index(); //0,1,2,3,4
        // alert(i);   
        var off_top = $('#wrap > section').eq(i).offset().top;
        //alert(off_top)

        $('html,body').stop().animate({scrollTop:off_top+"px"},800);
        // $('nav ul li').removeClass('on');
        // $('nav ul li').eq(i).addClass('on');

            return false;
    });


 $('#popup').draggable();

 //pop 이라는 이름의 쿠키 값을 가져옵니다.
 //처음 방문한 사람은 팝업이 보임
 if($.cookie('pop')!='no'){
     $('#popup').show();
 }
$("#popup area:eq(0)").click(function(){
    $('#popup').fadeOut('fast');
    //창닫기 버튼 클릭하면 팝업을 서서히 숨긴다.
});

$("#popup area:eq(1)").click(function(){
    $.cookie('pop','no',{expires:1});
    //expires 기간동안 pop에 no를 저장 
    $('#popup').fadeOut('fast');
    
});

   $('#notice_wrap').draggable();
    if(($.cookie('popup') == 'none')){
        $('#notice_wrap').hide();
    }
    //('popup') 변수에 none이 저장되있으면
    //$('#notice_wrap') 을 숨겨라

    var chk = $('#expiresChk');
    $('.closeBtn').on('click',closePop);

    function closePop(){
        if(chk.is(':checked')){//chk 에 체크가 되있으며(3일동안)
            $.cookie('popup','none',{expires:3});
        }
        $('#notice_wrap').fadeOut();
    }

});