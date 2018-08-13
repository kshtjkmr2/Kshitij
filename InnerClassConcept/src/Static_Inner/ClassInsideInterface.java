package Static_Inner;

public interface ClassInsideInterface {
	public void sendmail();
	static class Inner{
		public Inner(String list,String sub) {
			this.toList=list;
			this.subject=sub;
		}
		String toList;
		
		String subject;
	}
	
}
