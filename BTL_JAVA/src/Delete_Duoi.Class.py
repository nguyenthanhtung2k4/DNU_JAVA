import os

def delete_class_files(folder_path):
  """
  Hàm xóa tất cả các file có đuôi .class trong thư mục đã cho

  Args:
    folder_path: Đường dẫn đến thư mục cần quét
  """

  for root, dirs, files in os.walk(folder_path):
    for file in files:
      if file.endswith(".class"):
        file_path = os.path.join(root, file)
        try:
          os.remove(file_path)
          print(f"Đã xóa file: {file_path}")
        except OSError as e:
          print(f"Lỗi khi xóa file {file_path}: {e}")

if __name__ == "__main__":
#   folder_path = input("Nhập đường dẫn đến thư mục: ")
  delete_class_files("D:\CODE\DNU_JAVA\BTL_JAVA\src\Menu")
  delete_class_files("D:\CODE\DNU_JAVA\BTL_JAVA\src")