package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A3 {

	public static void FileWrite() throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\Mytest.txt");// ���� Ŭ���� �ҷ�����
		BufferedWriter k43_bw = new BufferedWriter(new FileWriter(k43_f));// ���۶����Ϳ��ٰ� ���� �����͸� �ִ´�(����ó��)

		k43_bw.write("�ȳ� ����");// ���Ͽ� �߰�
		k43_bw.newLine();// �ٹٲ�
		k43_bw.write("hillo ���");// ���Ͽ� �߰�
		k43_bw.newLine();// �ٹٲ�

		k43_bw.close();// ���� �ݱ�
	}

	public static void FileRead() throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\Mytest.txt");// ���� Ŭ���� �ҷ�����
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));// ���۸��� ���ٰ� ���� ������ �ִ´�(����ó��)

		String k43_readtxt;

		while ((k43_readtxt = k43_br.readLine()) != null) {// ���پ� ���� ������ ������� ������
			System.out.printf("%s\n", k43_readtxt);// ���پ� ���
		}
		k43_br.close();// ������ �ݴ´�

	}

	public static void main(String[] args) throws IOException {
		FileWrite();
		FileRead();
	}

}
