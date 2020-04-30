package it.corso.esempio.pojo;

public class HelloResponse {
	private String status;

	public String getStatus() {
		return status;
	}
	
	private String greating;
	
	
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getGreating() {
		return greating;
	}
	
	public void setGreating(String greating) {
		this.greating = greating;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HelloResponse other = (HelloResponse) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
}
