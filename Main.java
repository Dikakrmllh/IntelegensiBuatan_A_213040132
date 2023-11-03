package id;
import id.bfs.BreadthFirstSearch;
import id.dls.DepthLimitedSearch;
import id.ucs.NodeUCS;
import id.ucs.UniformCostSearch;

public class Main {
    public static void main(String[] args) {
        Node barad          = new Node("Barad");
        Node bucha          = new Node("Bucha");
        Node craita         = new Node("Craita");
        Node dobreta        = new Node("Dobreta");
        Node efor           = new Node("Efor");
        Node fagatas        = new Node("Fagatas");
        Node giurg          = new Node("Giurg");
        Node hirsota        = new Node("Hirsota");
        Node iasi           = new Node("Iasi");
        Node lugoj          = new Node("Lugoj");
        Node mehadia        = new Node("Mehadia");
        Node neamt          = new Node("Neamt");
        Node oradea         = new Node("Oradea");
        Node pitesti        = new Node("Pitesti");
        Node rimnicuVilcea  = new Node("Rimnicu Vilcea");
        Node sibiu          = new Node("Sibiu");
        Node timisoara      = new Node("Timisoara");
        Node urziceni       = new Node("Urziceni");
        Node vaslui         = new Node("Vaslui");
        Node zerind         = new Node("Zerind");

        barad.addTetangga(zerind);
        barad.addTetangga(sibiu);
        barad.addTetangga(timisoara);

        bucha.addTetangga(fagatas);
        bucha.addTetangga(pitesti);
        bucha.addTetangga(giurg);
        bucha.addTetangga(urziceni);

        craita.addTetangga(dobreta);
        craita.addTetangga(rimnicuVilcea);
        craita.addTetangga(pitesti);

        dobreta.addTetangga(mehadia);
        dobreta.addTetangga(craita);

        efor.addTetangga(hirsota);

        fagatas.addTetangga(sibiu);
        fagatas.addTetangga(bucha);

        giurg.addTetangga(bucha);

        hirsota.addTetangga(urziceni);
        hirsota.addTetangga(efor);

        iasi.addTetangga(neamt);
        iasi.addTetangga(vaslui);

        lugoj.addTetangga(timisoara);
        lugoj.addTetangga(mehadia);

        mehadia.addTetangga(lugoj);
        mehadia.addTetangga(dobreta);

        neamt.addTetangga(iasi);

        oradea.addTetangga(zerind);
        oradea.addTetangga(sibiu);

        pitesti.addTetangga(rimnicuVilcea);
        pitesti.addTetangga(craita);
        pitesti.addTetangga(bucha);

        rimnicuVilcea.addTetangga(sibiu);
        rimnicuVilcea.addTetangga(craita);
        rimnicuVilcea.addTetangga(pitesti);

        sibiu.addTetangga(barad);
        sibiu.addTetangga(oradea);
        sibiu.addTetangga(fagatas);
        sibiu.addTetangga(rimnicuVilcea);

        timisoara.addTetangga(barad);
        timisoara.addTetangga(lugoj);

        urziceni.addTetangga(bucha);
        urziceni.addTetangga(vaslui);
        urziceni.addTetangga(hirsota);

        vaslui.addTetangga(iasi);
        vaslui.addTetangga(urziceni);

        zerind.addTetangga(barad);
        zerind.addTetangga(oradea);

        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(barad, bucha);

        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(barad, bucha);
        System.out.println();

        NodeUCS aradUCS             = new NodeUCS(barad, 366);
        NodeUCS bucharestUCS        = new NodeUCS(bucha, 0);
        NodeUCS craiovaUCS          = new NodeUCS(craita, 160);
        NodeUCS dobretaUCS          = new NodeUCS(dobreta, 242);
        NodeUCS eforUCS             = new NodeUCS(efor, 161);
        NodeUCS fagatasUCS          = new NodeUCS(fagatas, 176);
        NodeUCS giurgUCS            = new NodeUCS(giurg, 77);
        NodeUCS hirsovaUCS          = new NodeUCS(hirsota, 151);
        NodeUCS iasiUCS             = new NodeUCS(iasi, 226);
        NodeUCS lugojUCS            = new NodeUCS(lugoj, 244);
        NodeUCS mehadiaUCS          = new NodeUCS(mehadia, 241);
        NodeUCS neamtUCS            = new NodeUCS(neamt, 234);
        NodeUCS oradeaUCS           = new NodeUCS(oradea, 380);
        NodeUCS pitestiUCS          = new NodeUCS(pitesti, 10);
        NodeUCS rimnicuVilceaUCS    = new NodeUCS(rimnicuVilcea, 193);
        NodeUCS sibiuUCS            = new NodeUCS(sibiu, 253);
        NodeUCS timisoaraUCS        = new NodeUCS(timisoara, 329);
        NodeUCS urziceniUCS         = new NodeUCS(urziceni, 80);
        NodeUCS vasluiUCS           = new NodeUCS(vaslui, 199);
        NodeUCS zerindUCS           = new NodeUCS(zerind, 374);

        aradUCS.addTetangga(zerindUCS);
        aradUCS.addTetangga(sibiuUCS);
        aradUCS.addTetangga(timisoaraUCS);

        bucharestUCS.addTetangga(fagatasUCS);
        bucharestUCS.addTetangga(pitestiUCS);
        bucharestUCS.addTetangga(giurgUCS);
        bucharestUCS.addTetangga(urziceniUCS);

        craiovaUCS.addTetangga(dobretaUCS);
        craiovaUCS.addTetangga(rimnicuVilceaUCS);
        craiovaUCS.addTetangga(pitestiUCS);

        dobretaUCS.addTetangga(mehadiaUCS);
        dobretaUCS.addTetangga(craiovaUCS);

        eforUCS.addTetangga(hirsovaUCS);

        fagatasUCS.addTetangga(sibiuUCS);
        fagatasUCS.addTetangga(bucharestUCS);

        giurgUCS.addTetangga(bucharestUCS);

        hirsovaUCS.addTetangga(urziceniUCS);
        hirsovaUCS.addTetangga(eforUCS);

        iasiUCS.addTetangga(neamtUCS);
        iasiUCS.addTetangga(vasluiUCS);

        lugojUCS.addTetangga(timisoaraUCS);
        lugojUCS.addTetangga(mehadiaUCS);

        mehadiaUCS.addTetangga(lugojUCS);
        mehadiaUCS.addTetangga(dobretaUCS);

        neamtUCS.addTetangga(iasiUCS);

        oradeaUCS.addTetangga(zerindUCS);
        oradeaUCS.addTetangga(sibiuUCS);

        pitestiUCS.addTetangga(rimnicuVilceaUCS);
        pitestiUCS.addTetangga(craiovaUCS);
        pitestiUCS.addTetangga(bucharestUCS);

        rimnicuVilceaUCS.addTetangga(sibiuUCS);
        rimnicuVilceaUCS.addTetangga(craiovaUCS);
        rimnicuVilceaUCS.addTetangga(pitestiUCS);

        sibiuUCS.addTetangga(aradUCS);
        sibiuUCS.addTetangga(oradeaUCS);
        sibiuUCS.addTetangga(fagatasUCS);
        sibiuUCS.addTetangga(rimnicuVilceaUCS);

        timisoaraUCS.addTetangga(aradUCS);
        timisoaraUCS.addTetangga(lugojUCS);

        urziceniUCS.addTetangga(bucharestUCS);
        urziceniUCS.addTetangga(vasluiUCS);
        urziceniUCS.addTetangga(hirsovaUCS);

        vasluiUCS.addTetangga(iasiUCS);
        vasluiUCS.addTetangga(urziceniUCS);

        zerindUCS.addTetangga(aradUCS);
        zerindUCS.addTetangga(oradeaUCS);

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(aradUCS, bucharestUCS);
        System.out.println();
    }
}