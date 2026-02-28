👤 Thông tin sinh viên

Họ và tên: Ma Trong Huy

Mã sinh viên: BIT230194

Môn học: Kiểm Thử Phần Mềm

📚 Tổng quan

Repository này lưu trữ toàn bộ bài thực hành theo tuần của môn Kiểm thử phần mềm, bao gồm:

Lý thuyết & nguyên lý kiểm thử

Unit Test với JUnit 5 (Java)

Kiểm thử End-to-End với Cypress

Kiểm thử hiệu năng với JMeter

Hình ảnh minh chứng kết quả test

🗂 Cấu trúc thư mục (Theo tuần)

├── BT_Tuan_1/        # Chương 1 – Testing Principles
├── BT_Tuan_2/        # Chương 2 – Unit Test (JUnit 5)
├── BT_Tuan_3/        # Chương 3 – Cypress E2E
├── BT_Tuan_4/        # Chương 4 – JMeter Performance Test
└── README.md
# BT Tuần 1- cantunsee

Làm bài tập về nhận diện hình ảnh qua trang web cantunsee.space

# BT Tuần 2 - Unit Test (StudentAnalyzer)

## Mô tả bài toán
Viết lớp `StudentAnalyzer` để:
1. `countExcellentStudents(List<Double> scores)`: đếm số học sinh đạt loại Giỏi (>= 8.0)
    - Bỏ qua điểm không hợp lệ: < 0 hoặc > 10
    - Nếu danh sách rỗng/null -> trả về 0
2. `calculateValidAverage(List<Double> scores)`: tính điểm trung bình của các điểm hợp lệ (0..10)
    - Bỏ qua điểm không hợp lệ: < 0 hoặc > 10
    - Nếu danh sách rỗng/null hoặc không có điểm hợp lệ -> trả về 0.0

## Cấu trúc thư mục
- `src/main/java/org/example/bt_tuan_2/StudentAnalyzer.java`: mã nguồn chính
- `src/test/java/org/example/bt_tuan_2/StudentAnalyzerTest.java`: unit test bằng JUnit 5

## Cách chạy test
mvn test

# 📘 BT Tuần 3 – Kiểm thử End-to-End với Cypress (SauceDemo)
## 1. 🎯 Mục tiêu

- Làm quen và thực hành kiểm thử tự động End-to-End (E2E) bằng Cypress

- Viết các kịch bản kiểm thử phổ biến cho website thương mại điện tử mẫu

- Chạy kiểm thử và thu thập kết quả chạy test (screenshot) để nộp bài

## 2. 📝 Mô tả bài toán

Sử dụng Cypress để kiểm thử website mẫu:

👉 https://www.saucedemo.com

- Website mô phỏng một cửa hàng trực tuyến với các chức năng:

    - Đăng nhập người dùng

    - Hiển thị danh sách sản phẩm

    - Thêm / xóa sản phẩm khỏi giỏ hàng

    - Sắp xếp sản phẩm theo giá

    - Thực hiện quy trình thanh toán (checkout)

⚙️ Yêu cầu môi trường

- Node.js v14 trở lên

- npm

- Visual Studio Code (hoặc trình soạn thảo mã nguồn bất kỳ)


## 3. 📁 Cấu trúc thư mục (Tuần 3)

- `week-end2end-cypress/cypress/e2e/login_spec.cy.js`: kiểm thử đăng nhập (thành công + thất bại)
- `week-end2end-cypress/cypress/e2e/cart_spec.cy.js`: kiểm thử giỏ hàng & checkout (add, sort, remove, checkout step two)
- `week-end2end-cypress/cypress.config.js`: cấu hình Cypress cho E2E
- `week-end2end-cypress/package.json`: khai báo project Node.js và scripts/phụ thuộc Cypress
- `week-end2end-cypress/cypress/evidence`: Ảnh minh chứng kết quả

## 4. 🚀 Cài đặt Cypress
npm init -y
npm install cypress --save-dev
npx cypress open

## 5. ✅ Các kịch bản kiểm thử đã thực hiện

🔐 1. Kiểm tra đăng nhập thành công

- Đăng nhập với tài khoản hợp lệ

- Username: standard_user

- Password: secret_sauce

- Xác minh chuyển hướng đến /inventory.html

❌ 2. Kiểm tra đăng nhập thất bại

- Đăng nhập với thông tin không hợp lệ

- Hệ thống hiển thị thông báo lỗi

📄 File kiểm thử:

cypress/e2e/login_spec.cy.js


📸 Minh chứng kết quả chạy test (login_spec_pass.png):

🛒 3. Kiểm tra thêm sản phẩm vào giỏ hàng

- Thêm sản phẩm đầu tiên vào giỏ hàng

- Biểu tượng giỏ hàng hiển thị số lượng

🔃 4. Kiểm tra sắp xếp sản phẩm theo giá (Low → High)

- Chọn bộ lọc Price (low to high)

- Sản phẩm đầu tiên có giá thấp nhất

➖ 5. Kiểm tra xóa sản phẩm khỏi giỏ hàng

- Thêm sản phẩm vào giỏ hàng

- Nhấn Remove

- Giỏ hàng không còn hiển thị số lượng

💳 6. Kiểm tra quy trình thanh toán (Checkout)

- Thêm sản phẩm vào giỏ hàng

- Cart → Checkout

- Nhập thông tin:

- First Name: John

- Last Name: Doe

- Zip Code: 12345

- Nhấn Continue

- Chuyển đến /checkout-step-two.html

📄 File kiểm thử:

cypress/e2e/cart_spec.cy.js


📸 Minh chứng kết quả chạy test (cart_spec_pass.png):

▶️ Cách chạy kiểm thử (Tuần 3)
npx cypress open


Sau đó chọn:

login_spec.cy.js

cart_spec.cy.js

## 📦 Kết quả nộp bài

- Mã nguồn Cypress

- 2 file kiểm thử end-to-end

- 2 ảnh minh chứng kết quả chạy test

- Tổng cộng 6 test case – tất cả đều PASS ✅

📊 BT Tuần 4 – Kiểm thử hiệu năng với JMeter

1️⃣ Mục tiêu

Hiểu cách sử dụng Apache JMeter để thực hiện kiểm thử hiệu năng.

Thiết kế các kịch bản kiểm thử với tham số khác nhau (số lượng người dùng, thời gian chạy, hành vi).

Thu thập và phân tích các chỉ số hiệu năng.

Viết báo cáo kết quả kiểm thử dưới dạng Markdown.
2️⃣ Website được chọn kiểm thử

Có thể thay thế bằng website dự án nhóm hoặc một website công khai phù hợp.

⚠ Lưu ý: Không gửi quá nhiều request để tránh vi phạm chính sách sử dụng (rate limiting).

3️⃣ Thiết lập môi trường

Tải JMeter:
https://jmeter.apache.org/download_jmeter.cgi

Chạy JMeter:

bin/jmeter.bat   


4️⃣ Cấu trúc thư mục (Tuần 4)
BT_Tuan_4/
└── jmeter/
    ├── performance_test.jmx        # File Test Plan JMeter
    ├── results.csv                 # File kết quả (nếu xuất CSV)
    ├── evidence/                   # Ảnh minh chứng
    │   ├── summary_report_1.png
    │   ├── summary_report_2.png
    │   └── summary_report_3.png
    └── README.md                   # Báo cáo phân tích kết quả
5️⃣ Thiết kế kịch bản kiểm thử

Trong Test Plan:

Thêm HTTP Request Defaults để cấu hình URL cơ sở.

Thêm các Thread Group.

Thêm Listeners:

View Results Tree

Summary Report

🔹 Thread Group 1 – Kịch bản cơ bản

Threads: 10

Loop Count: 5

Hành vi:

HTTP GET đến trang chủ

📌 Mục tiêu: Kiểm tra phản hồi cơ bản khi tải nhẹ.

🔹 Thread Group 2 – Kịch bản tải nặng

Threads: 50

Ramp-up Period: 30 giây

Hành vi:

HTTP GET trang chủ

HTTP GET một trang con (ví dụ: trang bài viết)

📌 Mục tiêu: Kiểm tra khả năng chịu tải khi nhiều người dùng truy cập đồng thời.

🔹 Thread Group 3 – Kịch bản tùy chỉnh

Threads: 20

Duration: 60 giây

Hành vi:

HTTP GET đến 2 trang con khác nhau
hoặc

HTTP POST (ví dụ: gửi form tìm kiếm nếu website hỗ trợ)

📌 Mục tiêu: Mô phỏng hành vi người dùng thực tế hơn.

6️⃣ Các chỉ số thu thập

Sau khi chạy từng Thread Group, thu thập:

⏱ Response Time (ms) – Thời gian phản hồi trung bình

🚀 Throughput – Số request xử lý mỗi giây

❌ Error Rate (%) – Tỷ lệ lỗi

Kết quả được lưu dưới dạng:

File CSV

Hoặc Screenshot của Summary Report

7️⃣ Phân tích kết quả (Ví dụ trình bày)
Kịch bản	Avg Response Time	Throughput	Error Rate
Cơ bản	250 ms	20 req/s	0%
Tải nặng	780 ms	65 req/s	2%
Tùy chỉnh	420 ms	30 req/s	0%
🔎 Nhận xét:

Khi tăng số lượng người dùng, thời gian phản hồi tăng.

Throughput tăng theo tải nhưng có thể xuất hiện lỗi khi tải cao.

Hệ thống vẫn hoạt động ổn định nếu Error Rate thấp (<5%).

📦 Kết quả nộp bài

✔ File JMeter (.jmx)

✔ File báo cáo README.md

✔ File kết quả (CSV hoặc Screenshot)

✔ Ảnh minh chứng chạy test

📚 Tài liệu tham khảo

https://docs.cypress.io

https://www.saucedemo.com