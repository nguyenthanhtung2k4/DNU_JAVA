public class card {
     public static void main(String[] args) {
         CreditCard card = new CreditCard("John Doe", 5000,"20h",500);
 
         card.useCard(1000); // Sử dụng thẻ tín dụng
         card.checkCreditLimit(); // Kiểm tra hạn mức tín dụng
         card.payDebt(500); // Thanh toán dư nợ
 
         card.showHistory(); // Hiển thị lịch sử giao dịch
     }
 }
 