==>Link tham khao: https://chatgpt.com/c/66fb8e29-9b44-800f-9cf6-3790486f4a57


1. Đăng nhập và Đăng ký tài khoản (Login and Registration)
- **Nhiệm vụ**: Người dùng có thể đăng ký tài khoản mới hoặc đăng nhập bằng thông tin tài khoản đã có. Xác thực người dùng để bảo vệ hệ thống khỏi truy cập trái phép.
     `Đăng nhập  hiện không cân thiết bởi chỉ phát triển bởi một cá nhân`
     
2. Quản lý tài khoản (Account Management)
- **Nhiệm vụ**: Xem và chỉnh sửa thông tin cá nhân của người dùng (tên, địa chỉ, email). Giúp người dùng theo dõi tình trạng tài khoản của mình, bao gồm số dư và thông tin liên quan.

##### 2.1 Quản lý thông tin chi tiêu người dùng :  Thêm vaof danh mục mà cần tiêu (Nó liên quan đến  phần Chuyển tiền,  rút tiền, ) 2.1 là class cha trong 2,3
#####

3. Chuyển khoản (Money Transfer)
- **Nhiệm vụ**: Chuyển tiền giữa các tài khoản ngân hàng. Hệ thống kiểm tra số dư và thực hiện giao dịch nếu đủ điều kiện. Lưu lại lịch sử chuyển khoản.

4. Nạp tiền và Rút tiền (Deposit and Withdrawal)
- **Nhiệm vụ**: Người dùng có thể nạp thêm tiền vào tài khoản hoặc rút tiền khỏi tài khoản của mình. Cập nhật số dư tài khoản sau mỗi giao dịch.

5. Quản lý thẻ tín dụng (Credit Card Management)
- **Nhiệm vụ**: Cho phép người dùng đăng ký và quản lý các thẻ tín dụng. Bao gồm các chức năng như thanh toán dư nợ, xem thông tin thẻ, và kiểm tra hạn mức tín dụng.

6. Vay vốn và trả nợ (Loan and Repayment Management)
- **Nhiệm vụ**: Người dùng có thể vay tiền từ ngân hàng với các điều khoản cụ thể và trả nợ định kỳ. Hệ thống tính toán lãi suất và số tiền phải trả theo kỳ hạn.

7. Tạo và quản lý tài khoản tiết kiệm (Savings Account Management)
- **Nhiệm vụ**: Người dùng có thể mở tài khoản tiết kiệm với kỳ hạn và lãi suất cố định. Hệ thống quản lý tiền gửi và tính toán số tiền lãi cho người dùng sau mỗi kỳ hạn.



// Xác định số tiền vay: Người dùng nhập số tiền muốn vay.
// Xác định kỳ hạn và lãi suất: Ngân hàng cung cấp các mức kỳ hạn vay và lãi suất tương ứng.
// Tính toán lãi suất và số tiền phải trả: Dựa trên số tiền vay, kỳ hạn và lãi suất, hệ thống sẽ tính toán tổng số tiền người dùng cần trả.
// Quản lý khoản vay: Hệ thống lưu trữ thông tin về các khoản vay hiện tại của người dùng.
// Thanh toán khoản vay: Người dùng có thể trả nợ theo định kỳ hoặc trả toàn bộ nợ trước thời hạn.



8. Quản lý giao dịch định kỳ (Recurring Transactions Management)
- **Nhiệm vụ**: Tự động thực hiện các giao dịch định kỳ như thanh toán hóa đơn điện, nước hoặc chuyển tiền theo lịch trình. Giúp người dùng tiện lợi trong việc quản lý chi tiêu định kỳ.

9. Xem lịch sử giao dịch (Transaction History)
- **Nhiệm vụ**: Hiển thị lịch sử tất cả các giao dịch đã thực hiện (nạp tiền, rút tiền, chuyển khoản, thanh toán, v.v.) để người dùng theo dõi hoạt động của mình.

10. Quản lý người thụ hưởng (Beneficiary Management)
- **Nhiệm vụ**: Lưu trữ và quản lý danh sách người thụ hưởng mà người dùng thường xuyên chuyển tiền tới. Hỗ trợ việc chuyển khoản nhanh chóng và an toàn hơn.

11. Bảo mật và xác thực (Account Security and Authentication)
- **Nhiệm vụ**: Tăng cường bảo mật với các cơ chế như xác thực hai yếu tố (2FA), thay đổi mật khẩu, và cảnh báo nếu phát hiện các hoạt động đáng ngờ.

12. Quản lý bảo hiểm (Insurance Management)
- **Nhiệm vụ**: Cho phép người dùng mua và quản lý các gói bảo hiểm (bảo hiểm y tế, bảo hiểm xe hơi, v.v.), cũng như thanh toán phí bảo hiểm định kỳ qua tài khoản ngân hàng.

13. Cài đặt hạn mức chi tiêu (Spending Limit Settings)
- **Nhiệm vụ**: Người dùng có thể cài đặt hạn mức chi tiêu hàng ngày hoặc hàng tháng. Hệ thống sẽ cảnh báo nếu người dùng vượt quá hạn mức này, giúp quản lý chi tiêu hiệu quả hơn.

14. Gửi tiết kiệm (Create Fixed Deposit Account)
- **Nhiệm vụ**: Cho phép người dùng mở tài khoản gửi tiết kiệm với kỳ hạn cố định. Hệ thống tự động tính toán lãi suất dựa trên số tiền và thời gian gửi.

15. Tạo báo cáo tài chính (Financial Report)
- **Nhiệm vụ**: Tạo báo cáo chi tiết về dòng tiền, chi tiêu, và lãi suất của người dùng. Báo cáo được hiển thị trong terminal giúp người dùng có cái nhìn tổng quan về tài chính của mình.

16. Đổi ngoại tệ (Currency Exchange)
- **Nhiệm vụ**: Người dùng có thể nhập số tiền và chọn loại tiền tệ để chuyển đổi (USD, EUR, v.v.). Hệ thống tính toán tỷ giá và hiển thị số tiền sau khi chuyển đổi.

17. Liên hệ hỗ trợ khách hàng (Customer Support Contact)
- **Nhiệm vụ**: Hiển thị thông tin liên hệ với hỗ trợ khách hàng và cho phép gửi yêu cầu hỗ trợ thông qua terminal nếu người dùng gặp vấn đề cần giúp đỡ.







# Dữ liệu lưu trữ ngắn hạn ( lưu trên máy)

- Nếu dữ liệu chỉ cần lưu tạm thời trong phiên làm việc (không cần lưu trữ lâu dài), bạn có thể lưu trong ArrayList, HashMap, hoặc các cấu trúc dữ liệu khác trong bộ nhớ. Tuy nhiên, khi chương trình kết thúc, dữ liệu này sẽ bị mất.


# Dữ liệu cần lưu trữ lâu dài 

-  Hệ thống nhỏ lên không cần phải sử dụng  SQL.  BTL không cho  phép.

- Cần  triển khai hệ thống lưu trữ bằng file được lưu trong máy. Sử dụng file csv, json,
