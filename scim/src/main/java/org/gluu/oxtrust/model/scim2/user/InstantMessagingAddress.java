package org.gluu.oxtrust.model.scim2.user;

import org.gluu.oxtrust.model.scim2.annotations.Attribute;

/**
 * Created by jgomer on 2017-09-04.
 *
 * Instant messaging address for the user.
 */
public class InstantMessagingAddress {

    @Attribute(description = "Instant messaging address for the User.",
            isRequired = true)  //specs says false but it doesn't make sense
    private String value;

    @Attribute(description = "A human readable name, primarily used for  display purposes.")
    private String display;

    @Attribute(description = "A label indicating the attribute's function; e.g., 'aim', 'gtalk', 'mobile' etc.",
            canonicalValues = { "aim", "gtalk", "icq", "xmpp", "msn", "skype", "qq", "yahoo" })
    private String type;

    @Attribute(description = "A Boolean value indicating the 'primary' or preferred attribute value for this attribute," +
            "e.g., the  preferred messenger or primary messenger. The primary attribute  value 'true' MUST appear no " +
            "more than once.")
    private boolean primary;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}
