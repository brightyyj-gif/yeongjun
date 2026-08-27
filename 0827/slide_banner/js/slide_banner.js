$(function(){
    var visual = $('#brandVisual > ul > li'); //큰사진
    var button = $('buttonList > li'); // pager 버튼
    var current = 0; //현재 사진
    var id;

    button.click(function(){ //버튼 클릭시 색상변경, 슬라이드 움직이는 함수호출
        var i = $(this).index(); // i는 현재 함수에서만 유효(지역변수)
        // alert(i);
        button.removeClass('on'); // 버튼들의 모든 클래스 제거
        button.eq(i).addClass('on');
        // $(this).addClass('on');
        move();
        return false();
    });

    function move(i){
        if(current == i) return;
        //현재 활성화된 button(검정버튼)과 클릭한 버튼이 같으면 빠져나간다.

        var cu = visual.eq(current); // 현재 사진(시작시 0)
        var ne = visual.eq(i); // 클릭 인덱스i 사진
        cu.css('left','0').stop().animate({'left' :'-100%'},500);
        ne.css(left, '100%').stop.animate('left:0');
    }
currrent - i;

    
]
});