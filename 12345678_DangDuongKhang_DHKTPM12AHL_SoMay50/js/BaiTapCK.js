// ---------------------Load toàn trang-----------------------------------
$(document).ready(function(){
	var i=1;
	$("#myBtn").click(function(){
		$("#myModal").modal();
	});
//----------------------Kiem tra ma sinh vien-----------------------------
	function KiemTraMaSV(){
	var kt=/^[0-9]{10}$/;
		if($("#txtMaSV").val() == ""){
			$("#tbMaSV").html("*Bắt buộc nhập !!");
			return false;
		}
		if(!kt.test($("#txtMaSV").val())){
			$("#tbMaSV").html("*mã sinh viên là chữ số có 10 chữ*");
			return false;
		}
	
		$("#tbMaSV").html("*");
		return true;
	}
	$("#txtMaSV").blur(KiemTraMaSV);
	//--------------------------Kiem tra ho ten----------------------------
	function KiemHoTen(){
	var kt=/^[A-Z][a-zA-Z]+(\s[A-Z][a-zA-Z]+)*$/;
	if($("#txtHoTen").val() == ""){
		$("#tbHoTen").html("*Bắt buộc nhập !!");
		return false;
	}
	if(!kt.test($("#txtHoTen").val())){
		$("#tbHoTen").html("*Chữ cái đầu của mỗi từ phải viết hoa !!");
		return false;
	}
	
	$("#tbHoTen").html("*");
	return true;
};
$("#txtHoTen").blur(KiemHoTen);
	//-------------------------Kiem tra email------------------------------
	function KTNgay(){
	if($("#txtNgayTG").val() == ""){
		$("#tbNgayTG").html("*Bắt buộc nhập !!");
		return false;	
	}
	
	var day = new Date($("#txtNgayTG").val());
	var today = new Date;
	today.setDate(today.getDate() + 7);
	if(day < today){
		$("#tbNgayTG").html("*Nhập ngày sau ngày hiện tại 7 ngày");
		return false;
	}
	$("#tbNgayTG").html("*");
	return true;
};
$("#txtNgayTG").blur(KTNgay);
//--------------------------Kiem tra email---------------------------------
function KTEmail(){
	var email=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)+(\.\w{2,3})+$/;
	if($("#txtEmail").val() == ""){
		$("#tbEmail").html("* Bắt buộc nhập");
		return false;
	}
	
	if(!email.test($("#txtEmail").val())){
		$("#tbEmail").html("* Nhập đúng định dạng mail");
		return false;
	}
	$("#tbEmail").html("*");
	return true;
}
$("#txtEmail").blur(KTEmail);
//---------------------------Kiem tra so dien thoai------------------------------------
function KTSDT(){
	var sdt=/^[0]{1}[1-9]{3}\-\d{3}\-\d{3}$/;
	if($("#txtSDT").val() == ""){
		$("#tbSDT").html("* Bắt buộc nhập");
		return false;
	}
	
	if(!sdt.test($("#txtSDT").val())){
		$("#tbSDT").html("Nhập theo dạng 0000-000-000 số đầu là số 0");
		return false;
	}
	$("#tbSDT").html("*");
	return true;
};
$("#txtSDT").blur(KTSDT);
//-----------------------------------Thêm vào bảng---------------------------------------
	$("#btnSave").click(function(){
	if(!KiemTraMaSV()||!KiemHoTen() ||!KTNgay() || !KTEmail() || !KTSDT()){
		$("#thongbao").html("*Nhập đúng và đủ thông tin");
		return false;
	}
	var maSV=$("#txtMaSV").val();
	var ten=$("#txtHoTen").val();
	var ngay=$("#txtNgayTG").val();
	var gmail=$("#txtEmail").val();
	var sdt=$("#txtSDT").val();
	
	var dong = "<tr><td>" + (i++) + "</td><td>" + maSV + "</td><td>" + ten + "</td><td>" + ngay + "</td><td>" + gmail + "</td><td>" + sdt + "</td></tr>";
	$("#bang").append(dong);
	$("#myModal").modal("hide");	
	
});
});