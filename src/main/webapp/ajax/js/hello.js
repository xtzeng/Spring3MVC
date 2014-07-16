
function test() {

	alert(1);
	//不能请求跨域的url地址
   $.ajax({
	   type: "POST",
	   url: "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=TOKEN",
	   data: '{"expire_seconds": 1800, "action_name": "QR_SCENE", "action_info": {"scene": {"scene_id": 123}}}',
	   success: function(msg){
	     alert( "Data Saved: " + msg );
   }
});
}