let dataProducts = []
let user = []
const modal = document.getElementById("myModal");
const btnLogin = document.getElementById('btnLogin');
const in4 = document.querySelector('.form-container');
const bangDiem = document.querySelector('.left');

btnLogin.onclick = () => {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    if(!username.trim() || !password.trim()){
        alert('Không được để trống')
    } else {
        const loginData = {
            taiKhoan: username,
            matKhau: password
        };
        fetch('http://localhost:8080/sinhVien', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(loginData)
        })
        .then(response => {
          if (response.status === 200) {
            bangDiem.innerHTML =`<div class="row border fs-5 bg-dangers text-center red">
                                    <div class="col border fw-bold">
                                    Stt
                                    </div>
                                    <div class="col border fw-bold">
                                    Mã môn học
                                    </div>
                                    <div class="col-4 border fw-bold">
                                    Tên môn học
                                    </div>
                                    <div class="col border fw-bold">
                                    Số tín chỉ
                                    </div>
                                    <div class="col border fw-bold">
                                    Điểm thi
                                    </div>
                                    <div class="col border fw-bold">
                                    Điểm TK <br> (10)
                                    </div>
                                    <div class="col border fw-bold">
                                    Điểm TK <br> (4)
                                    </div>
                                    <div class="col border fw-bold">
                                    Điểm TK <br> (C)
                                    </div>
                                    <div class="col border fw-bold">
                                    Kết quả
                                    </div>
                                    <div class="col border fw-bold">
                                    Chi tiết
                                    </div>
                                </div>`
            return response.json();
    
          } else {
                alert('Sai tài khoản hoặc mật khẩu!');
          }
        })
        .then(data => {
            console.log(data)
            dataProducts = [...data.dsHocKy]
            user = [data.maSinhVien, data.hoTen]
            // console.log(user)
            renderData()
        })
        .catch(error => {
          console.error('Đã xảy ra lỗi:', error);
        });
    }
}

function renderData() {
    in4.innerHTML = `<div class="info">
                        <div class="item">
                            <div>Tài khoản</div>
                            <div>${user[0]}</div>
                        </div>
                        <div class="item">
                            <div>Họ và tên</div>
                            <div>${user[1]}</div>
                        </div>
                        <button type="submit" class="btn" id="btnLogout"><i class="fa-solid fa-right-from-bracket"></i>   Đăng xuất</button>
                    </div>`
    
    const btnLogout = document.getElementById('btnLogout');
    btnLogout.onclick = () => {
        window.location.reload();
    }
    dataProducts.map((item) => {
        $('.left').append(
            `<div class="column fw-bold border border-danger p-2 hocKy"> Học kỳ ${item.tenHocKy} - năm học ${item.tenNamHoc} </div>`
        );
        // console.log(item.dsMonHoc)
        item.dsMonHoc.map((ds, id) => {
            let kq = `<i class="fa-solid fa-check text-danger"></i>`
            if(!ds.ketQua){
                kq = `<i class="fa-solid fa-xmark"></i>`
            }
            const dsDTP = JSON.stringify(ds.dsDiemThanhPhan);
            // console.log(dsDTP);
            $('.left').append(
                `<div class="row">
                    <div class="col border text-center">
                        ${id+1}
                    </div>
                    <div class="col border text-center">
                        ${ds.maMonHoc}
                    </div>
                    <div class="col-4 border">
                        ${ds.tenMonHoc}
                    </div>
                    <div class="col border text-center">
                        ${ds.soTinChi}
                    </div>
                    <div class="col border text-center">
                        ${ds.diemThi}
                    </div>
                    <div class="col border text-center">
                        ${ds.diemTK10}
                    </div>
                    <div class="col border text-center">
                        ${ds.diemTK4}
                    </div>
                    <div class="col border text-center">
                        ${ds.diemTKC}
                    </div>
                    <div class="col border text-center">
                        ${kq}
                    </div>
                    <a class="col border text-center info">
                        <i class="fa-solid fa-list text-danger" 
                            data-tenMH="${ds.tenMonHoc}"
                            data-dtp='[${dsDTP}]'></i>
                    </a>
                </div>`
            )
        });
        
        $('.left').append(
            `<div class="tong text-dangers">
                <div class="tong-left">
                    <div> - Điểm trung bình học kỳ hệ 4: <span class="fw-bold"> ${item.dtbhk4} </span> </div>
                    <div> - Điểm trung bình học kỳ hệ 10: <span class="fw-bold"> ${item.dtbhk10} </span> </div>
                    <div> - Số tín chỉ đạt học kỳ: <span class="fw-bold"> ${item.stcdhk} </span> </div>
                </div>
                <div class="tong-right">
                    <div> - Điểm trung bình tích lũy hệ 4: <span class="fw-bold"> ${item.dtbtl4} </span> </div>
                    <div> - Điểm trung bình tích lũy hệ 10: <span class="fw-bold"> ${item.dtbtl10} </span> </div>
                    <div> - Số tín chỉ tích lũy: <span class="fw-bold"> ${item.stctl} </span> </div>
                </div>
             </div>`
        )

    })
    const info = document.querySelectorAll('.fa-list');
    console.log(info.length)
    info.forEach((item) => {
        item.addEventListener('click', () => {
            const dataTenMH = item.getAttribute('data-tenMH');
            const dataDTP = JSON.parse(item.getAttribute('data-dtp'));
            var data = ""
            dataDTP[0].forEach((item, id) => {
                const str = `
                        <div class="row">
                            <div class="col border text-center">
                                ${id+1}
                            </div>
                            <div class="col-4 border">
                                ${item.ten}
                            </div>
                            <div class="col border text-center">
                                ${item.trongSo}
                            </div>
                            <div class="col-4 border text-center">
                                ${item.soDiem}
                            </div>
                        </div>`
                data += str
            });
            modal.innerHTML = `
                            <div class="modal-content">
                                <div class="modal-dialog">
                                    <div class="modal-header">
                                        <h6 class="modal-title">${dataTenMH}</h6>
                                    </div>
                                    <div class="modal-body container">
                                        <div class="row border fs-5 bg-dangers text-center red">
                                            <div class="col border fw-bold">
                                                Stt
                                            </div>
                                            <div class="col-4 border fw-bold">
                                                Tên thành phần
                                            </div>
                                            <div class="col border fw-bold">
                                                Trọng số (%)
                                            </div>
                                            <div class="col-4 border fw-bold">
                                                Điểm thành phần
                                            </div>
                                        </div>
                                        ${data}
                                    </div>
                                </div>
                            </div>`
            modal.style.display = "flex";
            window.onclick = function(event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        })
    });

}