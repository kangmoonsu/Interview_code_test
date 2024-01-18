package XX웨어_code_test;

/*
중복없는 파일명을 생성하기
file rename시 중복방지를 위한 코드이다.
[name].[ext] 형식일 때, 겹치지 않도록 [name](n).[ext] 의 형식으로 생성한다.
예) 아래와 같이 파일이 저장되어 있고
20200309_최종.png
20200309_최종_수정.png
20200309_최종_수정(1).png
20200309_최종_확정.png
20200309_최종_확정2.png
새로 저장하려는 파일의 이름이 “20200309_최종_확정2.png”이라고 할 때, 기존의 파일과 중복되므로 해당 파일의 이름은 “20200309_최종_확정2(1).png”로 변경되어야 한다.
*/
import java.io.File;

public class p6 {
    public static void main(String[] args) {
        String directoryPath = "파일이_저장된_폴더_경로";
        String newFileName = "새로_저장하려는_파일의_이름.확장자";

        String renamedFileName = getUniqueFileName(directoryPath, newFileName);

        // 파일명 변경
        File file = new File(directoryPath, newFileName);
        File renamedFile = new File(directoryPath, renamedFileName);
        if (file.renameTo(renamedFile)) {
            System.out.println("파일명이 변경되었습니다.");
        } else {
            System.out.println("파일명 변경에 실패했습니다.");
        }
    }

    // 중복을 피하면서 유니크한 파일명 생성
    public static String getUniqueFileName(String directoryPath, String fileName) {
        String baseName = fileName.substring(0, fileName.lastIndexOf('.'));
        String extension = fileName.substring(fileName.lastIndexOf('.'));

        String uniqueFileName = fileName;
        int index = 1;
        File file = new File(directoryPath, uniqueFileName);

        // 중복 체크
        while (file.exists()) {
            uniqueFileName = baseName + "(" + index + ")" + extension;
            file = new File(directoryPath, uniqueFileName);
            index++;
        }

        return uniqueFileName;
    }
}
