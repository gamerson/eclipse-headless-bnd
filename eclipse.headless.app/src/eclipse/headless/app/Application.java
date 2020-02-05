package eclipse.headless.app;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello Eclipse headless application!");
		
		return IApplication.EXIT_OK;
	}
	
	@Override
	public void stop() {
	}
}
