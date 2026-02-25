import javax.swing.*;

class Compare {
    public void verify(String name) {
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um nome!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (name.equalsIgnoreCase("Olivia")) {
            JOptionPane.showMessageDialog(null, name + " PENDEJA du carai!", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Olá " + name + ", tudo bem?", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}


/*import javax.swing.*;

class Compare {
    public void verify(String name) {
        if (name.equalsIgnoreCase("Olivia")) {
            JOptionPane.showMessageDialog(null, name + " PENDEJA du carai!", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else if (!name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Olá " + name + ", tudo bem?");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, digite um nome.");
        }
    }
}
*/



/*
class Compare {

    public void verify(String name) {
        String nameCompared = name;

        if (nameCompared.equalsIgnoreCase("Olivia")) {
            System.out.println(name + " PENDEJA du carai!\n");
        } else {
            System.out.println("Ola " + name + ", tudo bem?");
        }
    }
} 
*/