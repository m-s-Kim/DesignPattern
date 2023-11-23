package adapter;

public class AdapterImpl implements  Adapter{
	Math math;

	@Override
	public Float twiceOf(Float f) {
		return (float)math.twoTime(f);
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		return (float)math.half(f);
	}


}
