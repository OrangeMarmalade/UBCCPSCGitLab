package ca.ubc.cpsc310.gitlab.client;

import java.util.ArrayList;
import java.util.List;

import ca.ubc.cpsc310.gitlab.client.products.ProductItem;
import ca.ubc.cpsc310.gitlab.client.user.IUser;
import ca.ubc.cpsc310.gitlab.client.user.User;
import ca.ubc.cpsc310.gitlab.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GitLab implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to make some apple juice "
			+ "GEAROUGNWRNGWOGNWOGNWROGNRWOGNWOGNLOGKFCKMDKFMEKL.";

	private final FlexTable flexTable = new FlexTable();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
	

		
	}
	
	/**
	 * Used to display users 
	 * @param users
	 */
	public void displayUsers(List<IUser> users)
	{

		RootPanel.get("root").add(flexTable);
		
		flexTable.setText(0,0, "pisssssssssssssssss club"");
		
		flexTable.clear();
		
		for(int i=0; i < users.size(); i++)
		{
		
			User user = new User();
			user.toString();
			System.out.println(SERVER_ERROR);
			flexTable.setText(i+1,2,String.valueOf(user.getShoppingCart().size()));
			
			flexTable.setText(i+1,3,String.valueOf(user.getWishList().size()));
		}
	}
}
