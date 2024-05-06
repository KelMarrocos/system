package Project.store;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class inventory {
    public static void main(String[] args) {

        // Criando uma lista para armazenar os itens
      List<store> inventoryStore = new  ArrayList<>();

        // Adicionando itens à list;
        inventoryStore.add(new store("Smartphone", "SN001", 999.99f));
        inventoryStore.add(new store("Fone de ouvido", "SN002", 49.99f));
        inventoryStore.add(new store("Mouse sem fio", "SN003", 29.99f));
        inventoryStore.add(new store("Teclado mecânico", "SN004", 89.99f));
        inventoryStore.add(new store("Monitor LED 24\"", "SN005", 199.99f));
        inventoryStore.add(new store("Impressora multifuncional", "SN006", 149.99f));
        inventoryStore.add(new store("Tablet", "SN007", 299.99f));
        inventoryStore.add(new store("Câmera digital", "SN008", 199.99f));
        inventoryStore.add(new store("Carregador portátil", "SN009", 19.99f));
        inventoryStore.add(new store("HD externo 1TB", "SN010", 79.99f));
        inventoryStore.add(new store("Roteador Wi-Fi", "SN011", 49.99f));
        inventoryStore.add(new store("Smartwatch", "SN012", 129.99f));
        inventoryStore.add(new store("Caixa de som Bluetooth", "SN013", 39.99f));
        inventoryStore.add(new store("HD interno 500GB", "SN014", 59.99f));
        inventoryStore.add(new store("Webcam HD", "SN015", 29.99f));
        inventoryStore.add(new store("Mochila para laptop", "SN016", 39.99f));
        inventoryStore.add(new store("Carregador rápido USB-C", "SN017", 24.99f));
        inventoryStore.add(new store("Kit de ferramentas de precisão", "SN018", 19.99f));
        inventoryStore.add(new store("Power bank 10000mAh", "SN019", 29.99f));
        inventoryStore.add(new store("Cabo HDMI 2 metros", "SN020", 9.99f));
        inventoryStore.add(new store("Filtro de linha", "SN021", 19.99f));
        inventoryStore.add(new store("Pendrive 32GB", "SN022", 14.99f));
        inventoryStore.add(new store("Fone de ouvido Bluetooth", "SN023", 99.99F));
        inventoryStore.add(new store("Cadeira gamer", "SN024", 199.99f));
        inventoryStore.add(new store("Teclado sem fio", "SN025", 29.99f));
        inventoryStore.add(new store("Mouse gamer", "SN026", 39.99f));
        inventoryStore.add(new store("Monitor curvo 27\"", "SN027", 299.99f));
        inventoryStore.add(new store("Impressora a laser", "SN028", 19.99f));
        inventoryStore.add(new store("Câmera de segurança IP", "SN029", 49.99f));
        inventoryStore.add(new store("Tripé para câmera", "SN030", 19.99f));
        inventoryStore.add(new store("Hub USB 3.0", "SN031", 24.99f));
        inventoryStore.add(new store("Capa para celular", "SN032", 9.99f));
        inventoryStore.add(new store("Suporte para notebook", "SN033", 14.99f));
        inventoryStore.add(new store("Adaptador HDMI para VGA", "SN034", 12.99f));
        inventoryStore.add(new store("Microfone USB", "SN035", 39.99f));
        inventoryStore.add(new store("Teclado mecânico RGB", "SN036", 79.99f));
        inventoryStore.add(new store("Mousepad gamer", "SN037", 14.99f));
        inventoryStore.add(new store("Fone de ouvido com microfone", "SN038", 19.99f));
        inventoryStore.add(new store("Hub Ethernet USB-C", "SN039", 29.99f));
        inventoryStore.add(new store("Carregador sem fio", "SN040", 24.99f));
        inventoryStore.add(new store("Caixa de som portátil resistente à água", "SN041", 39.99f));
        inventoryStore.add(new store("Monitor ultrawide 34\"", "SN042", 499.99f));
        inventoryStore.add(new store("Pendrive 64GB", "SN043", 24.99f));
        inventoryStore.add(new store("Cabo USB tipo C", "SN044", 8.99f));
        inventoryStore.add(new store("Cadeira ergonômica", "SN045", 149.99f));
        inventoryStore.add(new store("Luminária LED", "SN046", 19.99f));
        inventoryStore.add(new store("Câmera esportiva 4K", "SN047", 79.99f));
        inventoryStore.add(new store("Mala de viagem", "SN048", 59.99f));
        inventoryStore.add(new store("Roteador mesh", "SN049", 99.99f));
        inventoryStore.add(new store("Estabilizador de tensão", "SN050", 49.99f));
        inventoryStore.add(new store("Suporte para monitor", "SN051", 19.99f));
        inventoryStore.add(new store("Adaptador USB para HDMI", "SN052", 12.99f));
        inventoryStore.add(new store("Kit de limpeza para eletrônicos", "SN053", 9.99f));
        inventoryStore.add(new store("Cooler para notebook", "SN054", 24.99f));
        inventoryStore.add(new store("Hub USB-C com leitor de cartão", "SN055", 29.99f));
        inventoryStore.add(new store("Mini projetor", "SN056", 129.99f));
        inventoryStore.add(new store("Cabo de rede Ethernet", "SN057", 7.99f));
        inventoryStore.add(new store("Filtro de linha com protetor", "SN058", 29.99f));
        inventoryStore.add(new store("Tripé para celular", "SN059", 9.99f));
        inventoryStore.add(new store("Webcam Full HD", "SN060", 49.99f));
        inventoryStore.add(new store("Suporte para tablet", "SN061", 14.99f));
        inventoryStore.add(new store("Adaptador USB para Ethernet", "SN062", 12.99f));
        inventoryStore.add(new store("Bateria externa 20000mAh", "SN063", 34.99f));
        inventoryStore.add(new store("Cadeira de escritório", "SN064", 179.99f));
        inventoryStore.add(new store("Teclado gamer mecânico", "SN065", 89.99f));
        inventoryStore.add(new store("Mochila anti-roubo", "SN066", 39.99f));
        inventoryStore.add(new store("Cabo Lightning para USB", "SN067", 9.99f));
        inventoryStore.add(new store("Hub USB-C com HDMI e PD", "SN068", 49.99f));
        inventoryStore.add(new store("Case para HD externo", "SN069", 10.99f));

        // Iterando sobre a lista para exibir os itens
        System.out.println("Lista de Itens:");

        for (store item : inventoryStore) {
            System.out.println("Nome: " + item.getProductName());
            System.out.println("Número de Série: " + item.getSerialNumber());
            System.out.println("Preço: $" + item.getValueOfTheProduct());
            System.out.println("----------------------");
        }
    }
}


