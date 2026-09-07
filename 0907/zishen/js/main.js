$(function(){

$(window).resize(function(){ //브라우저 사이즈 변경시
    var w = $(this).width(); //브라우저 넓이를 감지
    //console.log(w)
    if(w <=850){

    }else{
        //모바일 메뉴가 열려있으면(.active가 있으면)
        if($('.mobile_nav').hasClass('active') == true){
            $('.mobile_nav').removeClass('active');
            $('.transparency').removeClass('active');
            $('.container').removeClass('active');
            $('.mobile_nav .sub').css('display','none');
        }
    }


});


$('.nav ul').hover(function(){
    $(this).addClass('over');
},function(){
    $(this).removeClass("over");
})    

// 탭버튼 클릭스 모바일 메뉴 나오기
$('.mobile_tab').click(function(){
    $('.mobile_nav').addClass('active');
    $('.transparency').addClass('active');
	$('.container').addClass('active');
	return false;	
});

//.transparency 영역을 클릭하면 모바일메뉴 숨기기
$('.transparency').click(function(){
    $('.mobile_nav').removeClass('active');
    $('.transparency').removeClass('active');
    $('.container').removeClass('active');
     $('.mobile_nav .sub').css('display','none');
});
//아코디언 메뉴
$('.mobile_nav > ul > li > a').click(function(){
    var k = $(this).next('.sub').css('display');
    //alert(k);
    if(k === 'none'){
        $(".mobile_nav .sub").slideUp(300);
		$(this).next(".sub").slideDown(300);
    }else{
        $(this).next(".sub").slideUp(300);
        }

    return false;
});




});