$(function() {
				$.ajax({
					type: "get",
					url: "data/promotion.json",
					async: false,//不是异步加载,让ajax先执行
					dataType: "json",
					success: function(data) {
						$.each(data.pageData, function(i, item) {
							var str = '<div class="result col-md-3">';
							str += '<div class="thumbnail">';
							str += '<img src=' + '"' + item.titleImg + '"' + '>';
							str += '<div class="caption"><p>' + item.title + '</p>';
							str += '<p class="text-right status"><span>' + item.status + '</span></p>';
							str += '<p class="text-right grey">' + item.startDate + '-' + item.endDate + '</p>';
							str += '<p class="text-right grey">' + item.activescope + '</p>';
							str += '</div></div></div>';
							$("#hiddenpromotion").append(str);
						});
					}
				});
				
				//不要放在ajax里面,页面还要用到的函数
				var page_every = 4; //每页显示个数
						
				var num_entries = $("#hiddenpromotion div.result").length;
				$("#Pagination").pagination(num_entries, {
					num_edge_entries: 1, //边缘页数
					num_display_entries: 4, //主体页数
					callback: pageselectCallback,
					items_per_page: page_every, //每页显示个数							
					prev_text: "前一页",
					next_text: "后一页"
				});		
						
				function pageselectCallback(page_index,jq){
					$("#promotionresult").empty();
					var page_end = page_index * page_every;
					for (var i = 0;i<page_every;i++){
//					console.log(page_end);
                    var new_content = $('#hiddenpromotion div.result:eq('+page_end+')').clone();
					//这个id没改,所以加载不到数据!!!!!!!!!!!!!!!
					$("#promotionresult").append(new_content);
					page_end ++;
					}	
				}
			});