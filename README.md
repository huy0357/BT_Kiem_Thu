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

📚 Tài liệu tham khảo

https://docs.cypress.io

https://www.saucedemo.com