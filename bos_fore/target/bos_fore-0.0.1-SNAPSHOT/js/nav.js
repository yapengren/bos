

//go to top
$(document).ready(function($){
    var offset = 300,
        offset_opacity = 1200,
        scroll_top_duration = 700,
        $back_to_top = $('.cd-top');

    $(window).scroll(function(){
        ( $(this).scrollTop() > offset ) ? $back_to_top.addClass('cd-is-visible') : $back_to_top.removeClass('cd-is-visible cd-fade-out');
        if( $(this).scrollTop() > offset_opacity ) {
            $back_to_top.addClass('cd-fade-out');
        }
    });
    $back_to_top.on('click', function(event){
        event.preventDefault();
        $('body,html').animate({
                scrollTop: 0,
            }, scroll_top_duration
        );
    });
    var urlstr = location.href;
			//alert((urlstr + '/').indexOf($(this).attr('href')));
			var urlstatus = false;
			$("#menu a").each(function() {
				if((urlstr + '/').indexOf($(this).attr('href')) > -1 && $(this).attr('href') != '') {
					$(this).addClass('cur');
					urlstatus = true;
				} else {
					$(this).removeClass('cur');
				}
			});
			if(!urlstatus) {
				$("#menu a").eq(0).addClass('cur');
			}
	//加载尾部
	$(".nav-bottom").load("nav.html #footer");
});