package hello;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private MessageService service;
    
    
    
    public MessageService getService() {
		return service;
	}

	public void setService(MessageService service) {
		this.service = service;
	}

	// @Autowired
	// public MessagePrinter(MessageService service) {
	// this.service = service;
	// }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
