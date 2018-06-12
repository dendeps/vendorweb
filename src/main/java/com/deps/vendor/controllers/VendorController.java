package com.deps.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.deps.vendor.entities.Vendor;
import com.deps.vendor.service.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	VendorService service;
	
	@RequestMapping("/showAdd")
	public String showAdd() {
		return "addVendor";
	}
	
	@RequestMapping("/saveVen")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, 
			ModelMap modelMap) {
		Vendor vendorSaved=service.saveVendor(vendor);
		String msg = "Vendor saved with Id: "+vendorSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "addVendor";
	}
	
	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap) {
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		service.deleteVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/showEdit")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute(vendor);
		return "editVendor";
	}
	
	@RequestMapping("/updateVendor")
	public String updateVen(@ModelAttribute("vendor") Vendor vendor, 
			ModelMap modelMap) {
		service.updateVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}

}
