import java.util.ArrayList;

public interface IParams {
	public int getBig();
    // ��ȡ�г�λ
    public int getMedium();
    // ��ȡС��λ
    public int getSmall();
    // ��ȡͣ�����У����� [1 2 2 3] ��ʾ ����ͣһ���󳵣��г����г���С��
    public ArrayList<Integer> getPlanParking();
}
