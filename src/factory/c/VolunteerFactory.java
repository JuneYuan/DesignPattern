package factory.c;

//社区志愿者工厂
public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
