package service;

public class SumServiceImpl implements SumService {

	@Override
	public Integer Sum(int x, int y) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

}
