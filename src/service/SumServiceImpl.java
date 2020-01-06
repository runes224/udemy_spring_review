package service;

public class SumServiceImpl implements SumService {

	@Override
	public Integer Sum(int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

}
