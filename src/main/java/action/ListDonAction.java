package action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.DonService;

import com.opensymphony.xwork2.ActionSupport;

import dto.DonDTO;

@Controller
public class ListDonAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6874495899552728610L;

	private static final String SUCCESS = "success";

	private List<DonDTO> donList = new ArrayList<DonDTO>();
	private DonDTO don;
	private Long donId;

	@Autowired
	private DonService donService;

	public String listDon() {

		donList = donService.listDon();

		return SUCCESS;
	}

	public String deleteDon() {
		if (donId != null) {
			donService.deleteDon(donId);
		}
		return SUCCESS;
	}
// TODO
	/*
	public String addCustomer() {
		if (customerId != null) {
			for (final CustomerDTO customer : customerList) {
				if (customer.getCustomerId() == customerId) {
					final OrderCustomerDTO orderCustomer = new OrderCustomerDTO();
					orderCustomer.setOrderDate(new Date());
					customer.getOrderCustomers().add(orderCustomer);
					customerService.saveCustomerWithOrder(customer);
					break;
				}
			}
		}
		return SUCCESS;
	}*/

	public List<DonDTO> getDonList() {
		return donList;
	}

	public void setDonList(List<DonDTO> donList) {
		this.donList = donList;
	}

	public DonDTO getDon() {
		return don;
	}

	public void setDon(DonDTO don) {
		this.don = don;
	}

	public Long getDonId() {
		return donId;
	}

	public void setDonId(Long donId) {
		this.donId = donId;
	}

	public DonService getDonService() {
		return donService;
	}

	public void setDonService(DonService donService) {
		this.donService = donService;
	}

}
