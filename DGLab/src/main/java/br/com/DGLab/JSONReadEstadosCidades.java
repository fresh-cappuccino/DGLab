package br.com.DGLab;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONReadEstadosCidades {
	private String strJson = "{\r\n" + 
			"	\"estados\" : [\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"AC\",\r\n" + 
			"			\"nome\" : \"Acre\",\r\n" + 
			"			\"cidades\" : [ \"Acrelândia\", \"Assis Brasil\", \"Brasiléia\", \"Bujari\",\r\n" + 
			"					\"Capixaba\", \"Cruzeiro do Sul\", \"Epitaciolândia\", \"Feijó\",\r\n" + 
			"					\"Jordão\", \"Mâncio Lima\", \"Manoel Urbano\",\r\n" + 
			"					\"Marechal Thaumaturgo\", \"Plácido de Castro\", \"Porto Acre\",\r\n" + 
			"					\"Porto Walter\", \"Rio Branco\", \"Rodrigues Alves\",\r\n" + 
			"					\"Santa Rosa do Purus\", \"Sena Madureira\",\r\n" + 
			"					\"Senador Guiomard\", \"Tarauacá\", \"Xapuri\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"AL\",\r\n" + 
			"			\"nome\" : \"Alagoas\",\r\n" + 
			"			\"cidades\" : [ \"Água Branca\", \"Anadia\", \"Arapiraca\", \"Atalaia\",\r\n" + 
			"					\"Barra de Santo Antônio\", \"Barra de São Miguel\", \"Batalha\",\r\n" + 
			"					\"Belém\", \"Belo Monte\", \"Boca da Mata\", \"Branquinha\",\r\n" + 
			"					\"Cacimbinhas\", \"Cajueiro\", \"Campestre\", \"Campo Alegre\",\r\n" + 
			"					\"Campo Grande\", \"Canapi\", \"Capela\", \"Carneiros\",\r\n" + 
			"					\"Chã Preta\", \"Coité do Nóia\", \"Colônia Leopoldina\",\r\n" + 
			"					\"Coqueiro Seco\", \"Coruripe\", \"Craíbas\", \"Delmiro Gouveia\",\r\n" + 
			"					\"Dois Riachos\", \"Estrela de Alagoas\", \"Feira Grande\",\r\n" + 
			"					\"Feliz Deserto\", \"Flexeiras\", \"Girau do Ponciano\",\r\n" + 
			"					\"Ibateguara\", \"Igaci\", \"Igreja Nova\", \"Inhapi\",\r\n" + 
			"					\"Jacaré dos Homens\", \"Jacuípe\", \"Japaratinga\",\r\n" + 
			"					\"Jaramataia\", \"Jequiá da Praia\", \"Joaquim Gomes\", \"Jundiá\",\r\n" + 
			"					\"Junqueiro\", \"Lagoa da Canoa\", \"Limoeiro de Anadia\",\r\n" + 
			"					\"Maceió\", \"Major Isidoro\", \"Mar Vermelho\", \"Maragogi\",\r\n" + 
			"					\"Maravilha\", \"Marechal Deodoro\", \"Maribondo\",\r\n" + 
			"					\"Mata Grande\", \"Matriz de Camaragibe\", \"Messias\",\r\n" + 
			"					\"Minador do Negrão\", \"Monteirópolis\", \"Murici\",\r\n" + 
			"					\"Novo Lino\", \"Olho d'Água das Flores\",\r\n" + 
			"					\"Olho d'Água do Casado\", \"Olho d'Água Grande\", \"Olivença\",\r\n" + 
			"					\"Ouro Branco\", \"Palestina\", \"Palmeira dos Índios\",\r\n" + 
			"					\"Pão de Açúcar\", \"Pariconha\", \"Paripueira\",\r\n" + 
			"					\"Passo de Camaragibe\", \"Paulo Jacinto\", \"Penedo\",\r\n" + 
			"					\"Piaçabuçu\", \"Pilar\", \"Pindoba\", \"Piranhas\",\r\n" + 
			"					\"Poço das Trincheiras\", \"Porto Calvo\", \"Porto de Pedras\",\r\n" + 
			"					\"Porto Real do Colégio\", \"Quebrangulo\", \"Rio Largo\",\r\n" + 
			"					\"Roteiro\", \"Santa Luzia do Norte\", \"Santana do Ipanema\",\r\n" + 
			"					\"Santana do Mundaú\", \"São Brás\", \"São José da Laje\",\r\n" + 
			"					\"São José da Tapera\", \"São Luís do Quitunde\",\r\n" + 
			"					\"São Miguel dos Campos\", \"São Miguel dos Milagres\",\r\n" + 
			"					\"São Sebastião\", \"Satuba\", \"Senador Rui Palmeira\",\r\n" + 
			"					\"Tanque d'Arca\", \"Taquarana\", \"Teotônio Vilela\", \"Traipu\",\r\n" + 
			"					\"União dos Palmares\", \"Viçosa\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"AM\",\r\n" + 
			"			\"nome\" : \"Amazonas\",\r\n" + 
			"			\"cidades\" : [ \"Alvarães\", \"Amaturá\", \"Anamã\", \"Anori\", \"Apuí\",\r\n" + 
			"					\"Atalaia do Norte\", \"Autazes\", \"Barcelos\", \"Barreirinha\",\r\n" + 
			"					\"Benjamin Constant\", \"Beruri\", \"Boa Vista do Ramos\",\r\n" + 
			"					\"Boca do Acre\", \"Borba\", \"Caapiranga\", \"Canutama\",\r\n" + 
			"					\"Carauari\", \"Careiro\", \"Careiro da Várzea\", \"Coari\",\r\n" + 
			"					\"Codajás\", \"Eirunepé\", \"Envira\", \"Fonte Boa\", \"Guajará\",\r\n" + 
			"					\"Humaitá\", \"Ipixuna\", \"Iranduba\", \"Itacoatiara\",\r\n" + 
			"					\"Itamarati\", \"Itapiranga\", \"Japurá\", \"Juruá\", \"Jutaí\",\r\n" + 
			"					\"Lábrea\", \"Manacapuru\", \"Manaquiri\", \"Manaus\", \"Manicoré\",\r\n" + 
			"					\"Maraã\", \"Maués\", \"Nhamundá\", \"Nova Olinda do Norte\",\r\n" + 
			"					\"Novo Airão\", \"Novo Aripuanã\", \"Parintins\", \"Pauini\",\r\n" + 
			"					\"Presidente Figueiredo\", \"Rio Preto da Eva\",\r\n" + 
			"					\"Santa Isabel do Rio Negro\", \"Santo Antônio do Içá\",\r\n" + 
			"					\"São Gabriel da Cachoeira\", \"São Paulo de Olivença\",\r\n" + 
			"					\"São Sebastião do Uatumã\", \"Silves\", \"Tabatinga\", \"Tapauá\",\r\n" + 
			"					\"Tefé\", \"Tonantins\", \"Uarini\", \"Urucará\", \"Urucurituba\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"AP\",\r\n" + 
			"			\"nome\" : \"Amapá\",\r\n" + 
			"			\"cidades\" : [ \"Amapá\", \"Calçoene\", \"Cutias\", \"Ferreira Gomes\",\r\n" + 
			"					\"Itaubal\", \"Laranjal do Jari\", \"Macapá\", \"Mazagão\",\r\n" + 
			"					\"Oiapoque\", \"Pedra Branca do Amapari\", \"Porto Grande\",\r\n" + 
			"					\"Pracuúba\", \"Santana\", \"Serra do Navio\", \"Tartarugalzinho\",\r\n" + 
			"					\"Vitória do Jari\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"BA\",\r\n" + 
			"			\"nome\" : \"Bahia\",\r\n" + 
			"			\"cidades\" : [ \"Abaíra\", \"Abaré\", \"Acajutiba\", \"Adustina\",\r\n" + 
			"					\"Água Fria\", \"Aiquara\", \"Alagoinhas\", \"Alcobaça\",\r\n" + 
			"					\"Almadina\", \"Amargosa\", \"Amélia Rodrigues\",\r\n" + 
			"					\"América Dourada\", \"Anagé\", \"Andaraí\", \"Andorinha\",\r\n" + 
			"					\"Angical\", \"Anguera\", \"Antas\", \"Antônio Cardoso\",\r\n" + 
			"					\"Antônio Gonçalves\", \"Aporá\", \"Apuarema\", \"Araças\",\r\n" + 
			"					\"Aracatu\", \"Araci\", \"Aramari\", \"Arataca\", \"Aratuípe\",\r\n" + 
			"					\"Aurelino Leal\", \"Baianópolis\", \"Baixa Grande\", \"Banzaê\",\r\n" + 
			"					\"Barra\", \"Barra da Estiva\", \"Barra do Choça\",\r\n" + 
			"					\"Barra do Mendes\", \"Barra do Rocha\", \"Barreiras\",\r\n" + 
			"					\"Barro Alto\", \"Barrocas\", \"Barro Preto\", \"Belmonte\",\r\n" + 
			"					\"Belo Campo\", \"Biritinga\", \"Boa Nova\",\r\n" + 
			"					\"Boa Vista do Tupim\", \"Bom Jesus da Lapa\",\r\n" + 
			"					\"Bom Jesus da Serra\", \"Boninal\", \"Bonito\", \"Boquira\",\r\n" + 
			"					\"Botuporã\", \"Brejões\", \"Brejolândia\", \"Brotas de Macaúbas\",\r\n" + 
			"					\"Brumado\", \"Buerarema\", \"Buritirama\", \"Caatiba\",\r\n" + 
			"					\"Cabaceiras do Paraguaçu\", \"Cachoeira\", \"Caculé\", \"Caém\",\r\n" + 
			"					\"Caetanos\", \"Caetité\", \"Cafarnaum\", \"Cairu\",\r\n" + 
			"					\"Caldeirão Grande\", \"Camacan\", \"Camaçari\", \"Camamu\",\r\n" + 
			"					\"Campo Alegre de Lourdes\", \"Campo Formoso\", \"Canápolis\",\r\n" + 
			"					\"Canarana\", \"Canavieiras\", \"Candeal\", \"Candeias\",\r\n" + 
			"					\"Candiba\", \"Cândido Sales\", \"Cansanção\", \"Canudos\",\r\n" + 
			"					\"Capela do Alto Alegre\", \"Capim Grosso\", \"Caraíbas\",\r\n" + 
			"					\"Caravelas\", \"Cardeal da Silva\", \"Carinhanha\", \"Casa Nova\",\r\n" + 
			"					\"Castro Alves\", \"Catolândia\", \"Catu\", \"Caturama\",\r\n" + 
			"					\"Central\", \"Chorrochó\", \"Cícero Dantas\", \"Cipó\", \"Coaraci\",\r\n" + 
			"					\"Cocos\", \"Conceição da Feira\", \"Conceição do Almeida\",\r\n" + 
			"					\"Conceição do Coité\", \"Conceição do Jacuípe\", \"Conde\",\r\n" + 
			"					\"Condeúba\", \"Contendas do Sincorá\", \"Coração de Maria\",\r\n" + 
			"					\"Cordeiros\", \"Coribe\", \"Coronel João Sá\", \"Correntina\",\r\n" + 
			"					\"Cotegipe\", \"Cravolândia\", \"Crisópolis\", \"Cristópolis\",\r\n" + 
			"					\"Cruz das Almas\", \"Curaçá\", \"Dário Meira\", \"Dias d'Ávila\",\r\n" + 
			"					\"Dom Basílio\", \"Dom Macedo Costa\", \"Elísio Medrado\",\r\n" + 
			"					\"Encruzilhada\", \"Entre Rios\", \"Érico Cardoso\", \"Esplanada\",\r\n" + 
			"					\"Euclides da Cunha\", \"Eunápolis\", \"Fátima\",\r\n" + 
			"					\"Feira da Mata\", \"Feira de Santana\", \"Filadélfia\",\r\n" + 
			"					\"Firmino Alves\", \"Floresta Azul\", \"Formosa do Rio Preto\",\r\n" + 
			"					\"Gandu\", \"Gavião\", \"Gentio do Ouro\", \"Glória\", \"Gongogi\",\r\n" + 
			"					\"Governador Mangabeira\", \"Guajeru\", \"Guanambi\",\r\n" + 
			"					\"Guaratinga\", \"Heliópolis\", \"Iaçu\", \"Ibiassucê\",\r\n" + 
			"					\"Ibicaraí\", \"Ibicoara\", \"Ibicuí\", \"Ibipeba\", \"Ibipitanga\",\r\n" + 
			"					\"Ibiquera\", \"Ibirapitanga\", \"Ibirapuã\", \"Ibirataia\",\r\n" + 
			"					\"Ibitiara\", \"Ibititá\", \"Ibotirama\", \"Ichu\", \"Igaporã\",\r\n" + 
			"					\"Igrapiúna\", \"Iguaí\", \"Ilhéus\", \"Inhambupe\", \"Ipecaetá\",\r\n" + 
			"					\"Ipiaú\", \"Ipirá\", \"Ipupiara\", \"Irajuba\", \"Iramaia\",\r\n" + 
			"					\"Iraquara\", \"Irará\", \"Irecê\", \"Itabela\", \"Itaberaba\",\r\n" + 
			"					\"Itabuna\", \"Itacaré\", \"Itaeté\", \"Itagi\", \"Itagibá\",\r\n" + 
			"					\"Itagimirim\", \"Itaguaçu da Bahia\", \"Itaju do Colônia\",\r\n" + 
			"					\"Itajuípe\", \"Itamaraju\", \"Itamari\", \"Itambé\", \"Itanagra\",\r\n" + 
			"					\"Itanhém\", \"Itaparica\", \"Itapé\", \"Itapebi\", \"Itapetinga\",\r\n" + 
			"					\"Itapicuru\", \"Itapitanga\", \"Itaquara\", \"Itarantim\",\r\n" + 
			"					\"Itatim\", \"Itiruçu\", \"Itiúba\", \"Itororó\", \"Ituaçu\",\r\n" + 
			"					\"Ituberá\", \"Iuiú\", \"Jaborandi\", \"Jacaraci\", \"Jacobina\",\r\n" + 
			"					\"Jaguaquara\", \"Jaguarari\", \"Jaguaripe\", \"Jandaíra\",\r\n" + 
			"					\"Jequié\", \"Jeremoabo\", \"Jiquiriçá\", \"Jitaúna\",\r\n" + 
			"					\"João Dourado\", \"Juazeiro\", \"Jucuruçu\", \"Jussara\",\r\n" + 
			"					\"Jussari\", \"Jussiape\", \"Lafaiete Coutinho\", \"Lagoa Real\",\r\n" + 
			"					\"Laje\", \"Lajedão\", \"Lajedinho\", \"Lajedo do Tabocal\",\r\n" + 
			"					\"Lamarão\", \"Lapão\", \"Lauro de Freitas\", \"Lençóis\",\r\n" + 
			"					\"Licínio de Almeida\", \"Livramento de Nossa Senhora\",\r\n" + 
			"					\"Luís Eduardo Magalhães\", \"Macajuba\", \"Macarani\",\r\n" + 
			"					\"Macaúbas\", \"Macururé\", \"Madre de Deus\", \"Maetinga\",\r\n" + 
			"					\"Maiquinique\", \"Mairi\", \"Malhada\", \"Malhada de Pedras\",\r\n" + 
			"					\"Manoel Vitorino\", \"Mansidão\", \"Maracás\", \"Maragogipe\",\r\n" + 
			"					\"Maraú\", \"Marcionílio Souza\", \"Mascote\",\r\n" + 
			"					\"Mata de São João\", \"Matina\", \"Medeiros Neto\",\r\n" + 
			"					\"Miguel Calmon\", \"Milagres\", \"Mirangaba\", \"Mirante\",\r\n" + 
			"					\"Monte Santo\", \"Morpará\", \"Morro do Chapéu\", \"Mortugaba\",\r\n" + 
			"					\"Mucugê\", \"Mucuri\", \"Mulungu do Morro\", \"Mundo Novo\",\r\n" + 
			"					\"Muniz Ferreira\", \"Muquém de São Francisco\", \"Muritiba\",\r\n" + 
			"					\"Mutuípe\", \"Nazaré\", \"Nilo Peçanha\", \"Nordestina\",\r\n" + 
			"					\"Nova Canaã\", \"Nova Fátima\", \"Nova Ibiá\", \"Nova Itarana\",\r\n" + 
			"					\"Nova Redenção\", \"Nova Soure\", \"Nova Viçosa\",\r\n" + 
			"					\"Novo Horizonte\", \"Novo Triunfo\", \"Olindina\",\r\n" + 
			"					\"Oliveira dos Brejinhos\", \"Ouriçangas\", \"Ourolândia\",\r\n" + 
			"					\"Palmas de Monte Alto\", \"Palmeiras\", \"Paramirim\",\r\n" + 
			"					\"Paratinga\", \"Paripiranga\", \"Pau Brasil\", \"Paulo Afonso\",\r\n" + 
			"					\"Pé de Serra\", \"Pedrão\", \"Pedro Alexandre\", \"Piatã\",\r\n" + 
			"					\"Pilão Arcado\", \"Pindaí\", \"Pindobaçu\", \"Pintadas\",\r\n" + 
			"					\"Piraí do Norte\", \"Piripá\", \"Piritiba\", \"Planaltino\",\r\n" + 
			"					\"Planalto\", \"Poções\", \"Pojuca\", \"Ponto Novo\",\r\n" + 
			"					\"Porto Seguro\", \"Potiraguá\", \"Prado\", \"Presidente Dutra\",\r\n" + 
			"					\"Presidente Jânio Quadros\", \"Presidente Tancredo Neves\",\r\n" + 
			"					\"Queimadas\", \"Quijingue\", \"Quixabeira\", \"Rafael Jambeiro\",\r\n" + 
			"					\"Remanso\", \"Retirolândia\", \"Riachão das Neves\",\r\n" + 
			"					\"Riachão do Jacuípe\", \"Riacho de Santana\",\r\n" + 
			"					\"Ribeira do Amparo\", \"Ribeira do Pombal\",\r\n" + 
			"					\"Ribeirão do Largo\", \"Rio de Contas\", \"Rio do Antônio\",\r\n" + 
			"					\"Rio do Pires\", \"Rio Real\", \"Rodelas\", \"Ruy Barbosa\",\r\n" + 
			"					\"Salinas da Margarida\", \"Salvador\", \"Santa Bárbara\",\r\n" + 
			"					\"Santa Brígida\", \"Santa Cruz Cabrália\",\r\n" + 
			"					\"Santa Cruz da Vitória\", \"Santa Inês\", \"Santa Luzia\",\r\n" + 
			"					\"Santa Maria da Vitória\", \"Santa Rita de Cássia\",\r\n" + 
			"					\"Santa Teresinha\", \"Santaluz\", \"Santana\", \"Santanópolis\",\r\n" + 
			"					\"Santo Amaro\", \"Santo Antônio de Jesus\", \"Santo Estêvão\",\r\n" + 
			"					\"São Desidério\", \"São Domingos\", \"São Felipe\", \"São Félix\",\r\n" + 
			"					\"São Félix do Coribe\", \"São Francisco do Conde\",\r\n" + 
			"					\"São Gabriel\", \"São Gonçalo dos Campos\",\r\n" + 
			"					\"São José da Vitória\", \"São José do Jacuípe\",\r\n" + 
			"					\"São Miguel das Matas\", \"São Sebastião do Passé\",\r\n" + 
			"					\"Sapeaçu\", \"Sátiro Dias\", \"Saubara\", \"Saúde\", \"Seabra\",\r\n" + 
			"					\"Sebastião Laranjeiras\", \"Senhor do Bonfim\", \"Sento Sé\",\r\n" + 
			"					\"Serra do Ramalho\", \"Serra Dourada\", \"Serra Preta\",\r\n" + 
			"					\"Serrinha\", \"Serrolândia\", \"Simões Filho\", \"Sítio do Mato\",\r\n" + 
			"					\"Sítio do Quinto\", \"Sobradinho\", \"Souto Soares\",\r\n" + 
			"					\"Tabocas do Brejo Velho\", \"Tanhaçu\", \"Tanque Novo\",\r\n" + 
			"					\"Tanquinho\", \"Taperoá\", \"Tapiramutá\",\r\n" + 
			"					\"Teixeira de Freitas\", \"Teodoro Sampaio\", \"Teofilândia\",\r\n" + 
			"					\"Teolândia\", \"Terra Nova\", \"Tremedal\", \"Tucano\", \"Uauá\",\r\n" + 
			"					\"Ubaíra\", \"Ubaitaba\", \"Ubatã\", \"Uibaí\", \"Umburanas\", \"Una\",\r\n" + 
			"					\"Urandi\", \"Uruçuca\", \"Utinga\", \"Valença\", \"Valente\",\r\n" + 
			"					\"Várzea da Roça\", \"Várzea do Poço\", \"Várzea Nova\",\r\n" + 
			"					\"Varzedo\", \"Vera Cruz\", \"Vereda\", \"Vitória da Conquista\",\r\n" + 
			"					\"Wagner\", \"Wanderley\", \"Wenceslau Guimarães\", \"Xique-Xique\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"CE\",\r\n" + 
			"			\"nome\" : \"Ceará\",\r\n" + 
			"			\"cidades\" : [ \"Abaiara\", \"Acarapé\", \"Acaraú\", \"Acopiara\", \"Aiuaba\",\r\n" + 
			"					\"Alcântaras\", \"Altaneira\", \"Alto Santo\", \"Amontada\",\r\n" + 
			"					\"Antonina do Norte\", \"Apuiarés\", \"Aquiraz\", \"Aracati\",\r\n" + 
			"					\"Aracoiaba\", \"Ararendá\", \"Araripe\", \"Aratuba\", \"Arneiroz\",\r\n" + 
			"					\"Assaré\", \"Aurora\", \"Baixio\", \"Banabuiú\", \"Barbalha\",\r\n" + 
			"					\"Barreira\", \"Barro\", \"Barroquinha\", \"Baturité\", \"Beberibe\",\r\n" + 
			"					\"Bela Cruz\", \"Boa Viagem\", \"Brejo Santo\", \"Camocim\",\r\n" + 
			"					\"Campos Sales\", \"Canindé\", \"Capistrano\", \"Caridade\",\r\n" + 
			"					\"Cariré\", \"Caririaçu\", \"Cariús\", \"Carnaubal\", \"Cascavel\",\r\n" + 
			"					\"Catarina\", \"Catunda\", \"Caucaia\", \"Cedro\", \"Chaval\",\r\n" + 
			"					\"Choró\", \"Chorozinho\", \"Coreaú\", \"Crateús\", \"Crato\",\r\n" + 
			"					\"Croatá\", \"Cruz\", \"Deputado Irapuan Pinheiro\", \"Ererê\",\r\n" + 
			"					\"Eusébio\", \"Farias Brito\", \"Forquilha\", \"Fortaleza\",\r\n" + 
			"					\"Fortim\", \"Frecheirinha\", \"General Sampaio\", \"Graça\",\r\n" + 
			"					\"Granja\", \"Granjeiro\", \"Groaíras\", \"Guaiúba\",\r\n" + 
			"					\"Guaraciaba do Norte\", \"Guaramiranga\", \"Hidrolândia\",\r\n" + 
			"					\"Horizonte\", \"Ibaretama\", \"Ibiapina\", \"Ibicuitinga\",\r\n" + 
			"					\"Icapuí\", \"Icó\", \"Iguatu\", \"Independência\", \"Ipaporanga\",\r\n" + 
			"					\"Ipaumirim\", \"Ipu\", \"Ipueiras\", \"Iracema\", \"Irauçuba\",\r\n" + 
			"					\"Itaiçaba\", \"Itaitinga\", \"Itapagé\", \"Itapipoca\",\r\n" + 
			"					\"Itapiúna\", \"Itarema\", \"Itatira\", \"Jaguaretama\",\r\n" + 
			"					\"Jaguaribara\", \"Jaguaribe\", \"Jaguaruana\", \"Jardim\", \"Jati\",\r\n" + 
			"					\"Jijoca de Jericoaroara\", \"Juazeiro do Norte\", \"Jucás\",\r\n" + 
			"					\"Lavras da Mangabeira\", \"Limoeiro do Norte\", \"Madalena\",\r\n" + 
			"					\"Maracanaú\", \"Maranguape\", \"Marco\", \"Martinópole\",\r\n" + 
			"					\"Massapê\", \"Mauriti\", \"Meruoca\", \"Milagres\", \"Milhã\",\r\n" + 
			"					\"Miraíma\", \"Missão Velha\", \"Mombaça\", \"Monsenhor Tabosa\",\r\n" + 
			"					\"Morada Nova\", \"Moraújo\", \"Morrinhos\", \"Mucambo\",\r\n" + 
			"					\"Mulungu\", \"Nova Olinda\", \"Nova Russas\", \"Novo Oriente\",\r\n" + 
			"					\"Ocara\", \"Orós\", \"Pacajus\", \"Pacatuba\", \"Pacoti\", \"Pacujá\",\r\n" + 
			"					\"Palhano\", \"Palmácia\", \"Paracuru\", \"Paraipaba\", \"Parambu\",\r\n" + 
			"					\"Paramoti\", \"Pedra Branca\", \"Penaforte\", \"Pentecoste\",\r\n" + 
			"					\"Pereiro\", \"Pindoretama\", \"Piquet Carneiro\",\r\n" + 
			"					\"Pires Ferreira\", \"Poranga\", \"Porteiras\", \"Potengi\",\r\n" + 
			"					\"Potiretama\", \"Quiterianópolis\", \"Quixadá\", \"Quixelô\",\r\n" + 
			"					\"Quixeramobim\", \"Quixeré\", \"Redenção\", \"Reriutaba\",\r\n" + 
			"					\"Russas\", \"Saboeiro\", \"Salitre\", \"Santa Quitéria\",\r\n" + 
			"					\"Santana do Acaraú\", \"Santana do Cariri\", \"São Benedito\",\r\n" + 
			"					\"São Gonçalo do Amarante\", \"São João do Jaguaribe\",\r\n" + 
			"					\"São Luís do Curu\", \"Senador Pompeu\", \"Senador Sá\",\r\n" + 
			"					\"Sobral\", \"Solonópole\", \"Tabuleiro do Norte\", \"Tamboril\",\r\n" + 
			"					\"Tarrafas\", \"Tauá\", \"Tejuçuoca\", \"Tianguá\", \"Trairi\",\r\n" + 
			"					\"Tururu\", \"Ubajara\", \"Umari\", \"Umirim\", \"Uruburetama\",\r\n" + 
			"					\"Uruoca\", \"Varjota\", \"Várzea Alegre\", \"Viçosa do Ceará\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"DF\",\r\n" + 
			"			\"nome\" : \"Distrito Federal\",\r\n" + 
			"			\"cidades\" : [ \"Brasília\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"ES\",\r\n" + 
			"			\"nome\" : \"Espírito Santo\",\r\n" + 
			"			\"cidades\" : [ \"Afonso Cláudio\", \"Água Doce do Norte\",\r\n" + 
			"					\"Águia Branca\", \"Alegre\", \"Alfredo Chaves\",\r\n" + 
			"					\"Alto Rio Novo\", \"Anchieta\", \"Apiacá\", \"Aracruz\",\r\n" + 
			"					\"Atilio Vivacqua\", \"Baixo Guandu\",\r\n" + 
			"					\"Barra de São Francisco\", \"Boa Esperança\",\r\n" + 
			"					\"Bom Jesus do Norte\", \"Brejetuba\",\r\n" + 
			"					\"Cachoeiro de Itapemirim\", \"Cariacica\", \"Castelo\",\r\n" + 
			"					\"Colatina\", \"Conceição da Barra\", \"Conceição do Castelo\",\r\n" + 
			"					\"Divino de São Lourenço\", \"Domingos Martins\",\r\n" + 
			"					\"Dores do Rio Preto\", \"Ecoporanga\", \"Fundão\",\r\n" + 
			"					\"Governador Lindenberg\", \"Guaçuí\", \"Guarapari\", \"Ibatiba\",\r\n" + 
			"					\"Ibiraçu\", \"Ibitirama\", \"Iconha\", \"Irupi\", \"Itaguaçu\",\r\n" + 
			"					\"Itapemirim\", \"Itarana\", \"Iúna\", \"Jaguaré\",\r\n" + 
			"					\"Jerônimo Monteiro\", \"João Neiva\", \"Laranja da Terra\",\r\n" + 
			"					\"Linhares\", \"Mantenópolis\", \"Marataizes\",\r\n" + 
			"					\"Marechal Floriano\", \"Marilândia\", \"Mimoso do Sul\",\r\n" + 
			"					\"Montanha\", \"Mucurici\", \"Muniz Freire\", \"Muqui\",\r\n" + 
			"					\"Nova Venécia\", \"Pancas\", \"Pedro Canário\", \"Pinheiros\",\r\n" + 
			"					\"Piúma\", \"Ponto Belo\", \"Presidente Kennedy\", \"Rio Bananal\",\r\n" + 
			"					\"Rio Novo do Sul\", \"Santa Leopoldina\",\r\n" + 
			"					\"Santa Maria de Jetibá\", \"Santa Teresa\",\r\n" + 
			"					\"São Domingos do Norte\", \"São Gabriel da Palha\",\r\n" + 
			"					\"São José do Calçado\", \"São Mateus\", \"São Roque do Canaã\",\r\n" + 
			"					\"Serra\", \"Sooretama\", \"Vargem Alta\",\r\n" + 
			"					\"Venda Nova do Imigrante\", \"Viana\", \"Vila Pavão\",\r\n" + 
			"					\"Vila Valério\", \"Vila Velha\", \"Vitória\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"GO\",\r\n" + 
			"			\"nome\" : \"Goiás\",\r\n" + 
			"			\"cidades\" : [ \"Abadia de Goiás\", \"Abadiânia\", \"Acreúna\",\r\n" + 
			"					\"Adelândia\", \"Água Fria de Goiás\", \"Água Limpa\",\r\n" + 
			"					\"Águas Lindas de Goiás\", \"Alexânia\", \"Aloândia\",\r\n" + 
			"					\"Alto Horizonte\", \"Alto Paraíso de Goiás\",\r\n" + 
			"					\"Alvorada do Norte\", \"Amaralina\", \"Americano do Brasil\",\r\n" + 
			"					\"Amorinópolis\", \"Anápolis\", \"Anhanguera\", \"Anicuns\",\r\n" + 
			"					\"Aparecida de Goiânia\", \"Aparecida do Rio Doce\", \"Aporé\",\r\n" + 
			"					\"Araçu\", \"Aragarças\", \"Aragoiânia\", \"Araguapaz\",\r\n" + 
			"					\"Arenópolis\", \"Aruanã\", \"Aurilândia\", \"Avelinópolis\",\r\n" + 
			"					\"Baliza\", \"Barro Alto\", \"Bela Vista de Goiás\",\r\n" + 
			"					\"Bom Jardim de Goiás\", \"Bom Jesus de Goiás\",\r\n" + 
			"					\"Bonfinópolis\", \"Bonópolis\", \"Brazabrantes\", \"Britânia\",\r\n" + 
			"					\"Buriti Alegre\", \"Buriti de Goiás\", \"Buritinópolis\",\r\n" + 
			"					\"Cabeceiras\", \"Cachoeira Alta\", \"Cachoeira de Goiás\",\r\n" + 
			"					\"Cachoeira Dourada\", \"Caçu\", \"Caiapônia\", \"Caldas Novas\",\r\n" + 
			"					\"Caldazinha\", \"Campestre de Goiás\", \"Campinaçu\",\r\n" + 
			"					\"Campinorte\", \"Campo Alegre de Goiás\",\r\n" + 
			"					\"Campos Limpo de Goiás\", \"Campos Belos\", \"Campos Verdes\",\r\n" + 
			"					\"Carmo do Rio Verde\", \"Castelândia\", \"Catalão\", \"Caturaí\",\r\n" + 
			"					\"Cavalcante\", \"Ceres\", \"Cezarina\", \"Chapadão do Céu\",\r\n" + 
			"					\"Cidade Ocidental\", \"Cocalzinho de Goiás\",\r\n" + 
			"					\"Colinas do Sul\", \"Córrego do Ouro\", \"Corumbá de Goiás\",\r\n" + 
			"					\"Corumbaíba\", \"Cristalina\", \"Cristianópolis\", \"Crixás\",\r\n" + 
			"					\"Cromínia\", \"Cumari\", \"Damianópolis\", \"Damolândia\",\r\n" + 
			"					\"Davinópolis\", \"Diorama\", \"Divinópolis de Goiás\",\r\n" + 
			"					\"Doverlândia\", \"Edealina\", \"Edéia\", \"Estrela do Norte\",\r\n" + 
			"					\"Faina\", \"Fazenda Nova\", \"Firminópolis\", \"Flores de Goiás\",\r\n" + 
			"					\"Formosa\", \"Formoso\", \"Gameleira de Goiás\", \"Goianápolis\",\r\n" + 
			"					\"Goiandira\", \"Goianésia\", \"Goiânia\", \"Goianira\", \"Goiás\",\r\n" + 
			"					\"Goiatuba\", \"Gouvelândia\", \"Guapó\", \"Guaraíta\",\r\n" + 
			"					\"Guarani de Goiás\", \"Guarinos\", \"Heitoraí\", \"Hidrolândia\",\r\n" + 
			"					\"Hidrolina\", \"Iaciara\", \"Inaciolândia\", \"Indiara\",\r\n" + 
			"					\"Inhumas\", \"Ipameri\", \"Ipiranga de Goiás\", \"Iporá\",\r\n" + 
			"					\"Israelândia\", \"Itaberaí\", \"Itaguari\", \"Itaguaru\", \"Itajá\",\r\n" + 
			"					\"Itapaci\", \"Itapirapuã\", \"Itapuranga\", \"Itarumã\", \"Itauçu\",\r\n" + 
			"					\"Itumbiara\", \"Ivolândia\", \"Jandaia\", \"Jaraguá\", \"Jataí\",\r\n" + 
			"					\"Jaupaci\", \"Jesúpolis\", \"Joviânia\", \"Jussara\",\r\n" + 
			"					\"Lagoa Santa\", \"Leopoldo de Bulhões\", \"Luziânia\",\r\n" + 
			"					\"Mairipotaba\", \"Mambaí\", \"Mara Rosa\", \"Marzagão\",\r\n" + 
			"					\"Matrinchã\", \"Maurilândia\", \"Mimoso de Goiás\", \"Minaçu\",\r\n" + 
			"					\"Mineiros\", \"Moiporá\", \"Monte Alegre de Goiás\",\r\n" + 
			"					\"Montes Claros de Goiás\", \"Montividiu\",\r\n" + 
			"					\"Montividiu do Norte\", \"Morrinhos\", \"Morro Agudo de Goiás\",\r\n" + 
			"					\"Mossâmedes\", \"Mozarlândia\", \"Mundo Novo\", \"Mutunópolis\",\r\n" + 
			"					\"Nazário\", \"Nerópolis\", \"Niquelândia\", \"Nova América\",\r\n" + 
			"					\"Nova Aurora\", \"Nova Crixás\", \"Nova Glória\",\r\n" + 
			"					\"Nova Iguaçu de Goiás\", \"Nova Roma\", \"Nova Veneza\",\r\n" + 
			"					\"Novo Brasil\", \"Novo Gama\", \"Novo Planalto\", \"Orizona\",\r\n" + 
			"					\"Ouro Verde de Goiás\", \"Ouvidor\", \"Padre Bernardo\",\r\n" + 
			"					\"Palestina de Goiás\", \"Palmeiras de Goiás\", \"Palmelo\",\r\n" + 
			"					\"Palminópolis\", \"Panamá\", \"Paranaiguara\", \"Paraúna\",\r\n" + 
			"					\"Perolândia\", \"Petrolina de Goiás\", \"Pilar de Goiás\",\r\n" + 
			"					\"Piracanjuba\", \"Piranhas\", \"Pirenópolis\", \"Pires do Rio\",\r\n" + 
			"					\"Planaltina\", \"Pontalina\", \"Porangatu\", \"Porteirão\",\r\n" + 
			"					\"Portelândia\", \"Posse\", \"Professor Jamil\", \"Quirinópolis\",\r\n" + 
			"					\"Rialma\", \"Rianápolis\", \"Rio Quente\", \"Rio Verde\",\r\n" + 
			"					\"Rubiataba\", \"Sanclerlândia\", \"Santa Bárbara de Goiás\",\r\n" + 
			"					\"Santa Cruz de Goiás\", \"Santa Fé de Goiás\",\r\n" + 
			"					\"Santa Helena de Goiás\", \"Santa Isabel\",\r\n" + 
			"					\"Santa Rita do Araguaia\", \"Santa Rita do Novo Destino\",\r\n" + 
			"					\"Santa Rosa de Goiás\", \"Santa Tereza de Goiás\",\r\n" + 
			"					\"Santa Terezinha de Goiás\", \"Santo Antônio da Barra\",\r\n" + 
			"					\"Santo Antônio de Goiás\", \"Santo Antônio do Descoberto\",\r\n" + 
			"					\"São Domingos\", \"São Francisco de Goiás\",\r\n" + 
			"					\"São João d'Aliança\", \"São João da Paraúna\",\r\n" + 
			"					\"São Luís de Montes Belos\", \"São Luíz do Norte\",\r\n" + 
			"					\"São Miguel do Araguaia\", \"São Miguel do Passa Quatro\",\r\n" + 
			"					\"São Patrício\", \"São Simão\", \"Senador Canedo\",\r\n" + 
			"					\"Serranópolis\", \"Silvânia\", \"Simolândia\", \"Sítio d'Abadia\",\r\n" + 
			"					\"Taquaral de Goiás\", \"Teresina de Goiás\",\r\n" + 
			"					\"Terezópolis de Goiás\", \"Três Ranchos\", \"Trindade\",\r\n" + 
			"					\"Trombas\", \"Turvânia\", \"Turvelândia\", \"Uirapuru\", \"Uruaçu\",\r\n" + 
			"					\"Uruana\", \"Urutaí\", \"Valparaíso de Goiás\", \"Varjão\",\r\n" + 
			"					\"Vianópolis\", \"Vicentinópolis\", \"Vila Boa\", \"Vila Propício\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"MA\",\r\n" + 
			"			\"nome\" : \"Maranhão\",\r\n" + 
			"			\"cidades\" : [ \"Açailândia\", \"Afonso Cunha\",\r\n" + 
			"					\"Água Doce do Maranhão\", \"Alcântara\", \"Aldeias Altas\",\r\n" + 
			"					\"Altamira do Maranhão\", \"Alto Alegre do Maranhão\",\r\n" + 
			"					\"Alto Alegre do Pindaré\", \"Alto Parnaíba\",\r\n" + 
			"					\"Amapá do Maranhão\", \"Amarante do Maranhão\", \"Anajatuba\",\r\n" + 
			"					\"Anapurus\", \"Apicum-Açu\", \"Araguanã\", \"Araioses\", \"Arame\",\r\n" + 
			"					\"Arari\", \"Axixá\", \"Bacabal\", \"Bacabeira\", \"Bacuri\",\r\n" + 
			"					\"Bacurituba\", \"Balsas\", \"Barão de Grajaú\",\r\n" + 
			"					\"Barra do Corda\", \"Barreirinhas\", \"Bela Vista do Maranhão\",\r\n" + 
			"					\"Belágua\", \"Benedito Leite\", \"Bequimão\",\r\n" + 
			"					\"Bernardo do Mearim\", \"Boa Vista do Gurupi\", \"Bom Jardim\",\r\n" + 
			"					\"Bom Jesus das Selvas\", \"Bom Lugar\", \"Brejo\",\r\n" + 
			"					\"Brejo de Areia\", \"Buriti\", \"Buriti Bravo\", \"Buriticupu\",\r\n" + 
			"					\"Buritirana\", \"Cachoeira Grande\", \"Cajapió\", \"Cajari\",\r\n" + 
			"					\"Campestre do Maranhão\", \"Cândido Mendes\", \"Cantanhede\",\r\n" + 
			"					\"Capinzal do Norte\", \"Carolina\", \"Carutapera\", \"Caxias\",\r\n" + 
			"					\"Cedral\", \"Central do Maranhão\", \"Centro do Guilherme\",\r\n" + 
			"					\"Centro Novo do Maranhão\", \"Chapadinha\", \"Cidelândia\",\r\n" + 
			"					\"Codó\", \"Coelho Neto\", \"Colinas\", \"Conceição do Lago-Açu\",\r\n" + 
			"					\"Coroatá\", \"Cururupu\", \"Davinópolis\", \"Dom Pedro\",\r\n" + 
			"					\"Duque Bacelar\", \"Esperantinópolis\", \"Estreito\",\r\n" + 
			"					\"Feira Nova do Maranhão\", \"Fernando Falcão\",\r\n" + 
			"					\"Formosa da Serra Negra\", \"Fortaleza dos Nogueiras\",\r\n" + 
			"					\"Fortuna\", \"Godofredo Viana\", \"Gonçalves Dias\",\r\n" + 
			"					\"Governador Archer\", \"Governador Edison Lobão\",\r\n" + 
			"					\"Governador Eugênio Barros\", \"Governador Luiz Rocha\",\r\n" + 
			"					\"Governador Newton Bello\", \"Governador Nunes Freire\",\r\n" + 
			"					\"Graça Aranha\", \"Grajaú\", \"Guimarães\",\r\n" + 
			"					\"Humberto de Campos\", \"Icatu\", \"Igarapé do Meio\",\r\n" + 
			"					\"Igarapé Grande\", \"Imperatriz\", \"Itaipava do Grajaú\",\r\n" + 
			"					\"Itapecuru Mirim\", \"Itinga do Maranhão\", \"Jatobá\",\r\n" + 
			"					\"Jenipapo dos Vieiras\", \"João Lisboa\", \"Joselândia\",\r\n" + 
			"					\"Junco do Maranhão\", \"Lago da Pedra\", \"Lago do Junco\",\r\n" + 
			"					\"Lago dos Rodrigues\", \"Lago Verde\", \"Lagoa do Mato\",\r\n" + 
			"					\"Lagoa Grande do Maranhão\", \"Lajeado Novo\", \"Lima Campos\",\r\n" + 
			"					\"Loreto\", \"Luís Domingues\", \"Magalhães de Almeida\",\r\n" + 
			"					\"Maracaçumé\", \"Marajá do Sena\", \"Maranhãozinho\",\r\n" + 
			"					\"Mata Roma\", \"Matinha\", \"Matões\", \"Matões do Norte\",\r\n" + 
			"					\"Milagres do Maranhão\", \"Mirador\", \"Miranda do Norte\",\r\n" + 
			"					\"Mirinzal\", \"Monção\", \"Montes Altos\", \"Morros\",\r\n" + 
			"					\"Nina Rodrigues\", \"Nova Colinas\", \"Nova Iorque\",\r\n" + 
			"					\"Nova Olinda do Maranhão\", \"Olho d'Água das Cunhãs\",\r\n" + 
			"					\"Olinda Nova do Maranhão\", \"Paço do Lumiar\",\r\n" + 
			"					\"Palmeirândia\", \"Paraibano\", \"Parnarama\",\r\n" + 
			"					\"Passagem Franca\", \"Pastos Bons\", \"Paulino Neves\",\r\n" + 
			"					\"Paulo Ramos\", \"Pedreiras\", \"Pedro do Rosário\", \"Penalva\",\r\n" + 
			"					\"Peri Mirim\", \"Peritoró\", \"Pindaré Mirim\", \"Pinheiro\",\r\n" + 
			"					\"Pio XII\", \"Pirapemas\", \"Poção de Pedras\", \"Porto Franco\",\r\n" + 
			"					\"Porto Rico do Maranhão\", \"Presidente Dutra\",\r\n" + 
			"					\"Presidente Juscelino\", \"Presidente Médici\",\r\n" + 
			"					\"Presidente Sarney\", \"Presidente Vargas\", \"Primeira Cruz\",\r\n" + 
			"					\"Raposa\", \"Riachão\", \"Ribamar Fiquene\", \"Rosário\",\r\n" + 
			"					\"Sambaíba\", \"Santa Filomena do Maranhão\", \"Santa Helena\",\r\n" + 
			"					\"Santa Inês\", \"Santa Luzia\", \"Santa Luzia do Paruá\",\r\n" + 
			"					\"Santa Quitéria do Maranhão\", \"Santa Rita\",\r\n" + 
			"					\"Santana do Maranhão\", \"Santo Amaro do Maranhão\",\r\n" + 
			"					\"Santo Antônio dos Lopes\", \"São Benedito do Rio Preto\",\r\n" + 
			"					\"São Bento\", \"São Bernardo\", \"São Domingos do Azeitão\",\r\n" + 
			"					\"São Domingos do Maranhão\", \"São Félix de Balsas\",\r\n" + 
			"					\"São Francisco do Brejão\", \"São Francisco do Maranhão\",\r\n" + 
			"					\"São João Batista\", \"São João do Carú\",\r\n" + 
			"					\"São João do Paraíso\", \"São João do Soter\",\r\n" + 
			"					\"São João dos Patos\", \"São José de Ribamar\",\r\n" + 
			"					\"São José dos Basílios\", \"São Luís\",\r\n" + 
			"					\"São Luís Gonzaga do Maranhão\", \"São Mateus do Maranhão\",\r\n" + 
			"					\"São Pedro da Água Branca\", \"São Pedro dos Crentes\",\r\n" + 
			"					\"São Raimundo das Mangabeiras\",\r\n" + 
			"					\"São Raimundo do Doca Bezerra\", \"São Roberto\",\r\n" + 
			"					\"São Vicente Ferrer\", \"Satubinha\",\r\n" + 
			"					\"Senador Alexandre Costa\", \"Senador La Rocque\",\r\n" + 
			"					\"Serrano do Maranhão\", \"Sítio Novo\", \"Sucupira do Norte\",\r\n" + 
			"					\"Sucupira do Riachão\", \"Tasso Fragoso\", \"Timbiras\",\r\n" + 
			"					\"Timon\", \"Trizidela do Vale\", \"Tufilândia\", \"Tuntum\",\r\n" + 
			"					\"Turiaçu\", \"Turilândia\", \"Tutóia\", \"Urbano Santos\",\r\n" + 
			"					\"Vargem Grande\", \"Viana\", \"Vila Nova dos Martírios\",\r\n" + 
			"					\"Vitória do Mearim\", \"Vitorino Freire\", \"Zé Doca\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"MG\",\r\n" + 
			"			\"nome\" : \"Minas Gerais\",\r\n" + 
			"			\"cidades\" : [ \"Abadia dos Dourados\", \"Abaeté\", \"Abre Campo\",\r\n" + 
			"					\"Acaiaca\", \"Açucena\", \"Água Boa\", \"Água Comprida\",\r\n" + 
			"					\"Aguanil\", \"Águas Formosas\", \"Águas Vermelhas\", \"Aimorés\",\r\n" + 
			"					\"Aiuruoca\", \"Alagoa\", \"Albertina\", \"Além Paraíba\",\r\n" + 
			"					\"Alfenas\", \"Alfredo Vasconcelos\", \"Almenara\", \"Alpercata\",\r\n" + 
			"					\"Alpinópolis\", \"Alterosa\", \"Alto Caparaó\",\r\n" + 
			"					\"Alto Jequitibá\", \"Alto Rio Doce\", \"Alvarenga\",\r\n" + 
			"					\"Alvinópolis\", \"Alvorada de Minas\", \"Amparo do Serra\",\r\n" + 
			"					\"Andradas\", \"Andrelândia\", \"Angelândia\", \"Antônio Carlos\",\r\n" + 
			"					\"Antônio Dias\", \"Antônio Prado de Minas\", \"Araçaí\",\r\n" + 
			"					\"Aracitaba\", \"Araçuaí\", \"Araguari\", \"Arantina\", \"Araponga\",\r\n" + 
			"					\"Araporã\", \"Arapuá\", \"Araújos\", \"Araxá\", \"Arceburgo\",\r\n" + 
			"					\"Arcos\", \"Areado\", \"Argirita\", \"Aricanduva\", \"Arinos\",\r\n" + 
			"					\"Astolfo Dutra\", \"Ataléia\", \"Augusto de Lima\", \"Baependi\",\r\n" + 
			"					\"Baldim\", \"Bambuí\", \"Bandeira\", \"Bandeira do Sul\",\r\n" + 
			"					\"Barão de Cocais\", \"Barão de Monte Alto\", \"Barbacena\",\r\n" + 
			"					\"Barra Longa\", \"Barroso\", \"Bela Vista de Minas\",\r\n" + 
			"					\"Belmiro Braga\", \"Belo Horizonte\", \"Belo Oriente\",\r\n" + 
			"					\"Belo Vale\", \"Berilo\", \"Berizal\", \"Bertópolis\", \"Betim\",\r\n" + 
			"					\"Bias Fortes\", \"Bicas\", \"Biquinhas\", \"Boa Esperança\",\r\n" + 
			"					\"Bocaina de Minas\", \"Bocaiúva\", \"Bom Despacho\",\r\n" + 
			"					\"Bom Jardim de Minas\", \"Bom Jesus da Penha\",\r\n" + 
			"					\"Bom Jesus do Amparo\", \"Bom Jesus do Galho\", \"Bom Repouso\",\r\n" + 
			"					\"Bom Sucesso\", \"Bonfim\", \"Bonfinópolis de Minas\",\r\n" + 
			"					\"Bonito de Minas\", \"Borda da Mata\", \"Botelhos\",\r\n" + 
			"					\"Botumirim\", \"Brás Pires\", \"Brasilândia de Minas\",\r\n" + 
			"					\"Brasília de Minas\", \"Brasópolis\", \"Braúnas\", \"Brumadinho\",\r\n" + 
			"					\"Bueno Brandão\", \"Buenópolis\", \"Bugre\", \"Buritis\",\r\n" + 
			"					\"Buritizeiro\", \"Cabeceira Grande\", \"Cabo Verde\",\r\n" + 
			"					\"Cachoeira da Prata\", \"Cachoeira de Minas\",\r\n" + 
			"					\"Cachoeira de Pajeú\", \"Cachoeira Dourada\", \"Caetanópolis\",\r\n" + 
			"					\"Caeté\", \"Caiana\", \"Cajuri\", \"Caldas\", \"Camacho\",\r\n" + 
			"					\"Camanducaia\", \"Cambuí\", \"Cambuquira\", \"Campanário\",\r\n" + 
			"					\"Campanha\", \"Campestre\", \"Campina Verde\", \"Campo Azul\",\r\n" + 
			"					\"Campo Belo\", \"Campo do Meio\", \"Campo Florido\",\r\n" + 
			"					\"Campos Altos\", \"Campos Gerais\", \"Cana Verde\", \"Canaã\",\r\n" + 
			"					\"Canápolis\", \"Candeias\", \"Cantagalo\", \"Caparaó\",\r\n" + 
			"					\"Capela Nova\", \"Capelinha\", \"Capetinga\", \"Capim Branco\",\r\n" + 
			"					\"Capinópolis\", \"Capitão Andrade\", \"Capitão Enéas\",\r\n" + 
			"					\"Capitólio\", \"Caputira\", \"Caraí\", \"Caranaíba\", \"Carandaí\",\r\n" + 
			"					\"Carangola\", \"Caratinga\", \"Carbonita\", \"Careaçu\",\r\n" + 
			"					\"Carlos Chagas\", \"Carmésia\", \"Carmo da Cachoeira\",\r\n" + 
			"					\"Carmo da Mata\", \"Carmo de Minas\", \"Carmo do Cajuru\",\r\n" + 
			"					\"Carmo do Paranaíba\", \"Carmo do Rio Claro\",\r\n" + 
			"					\"Carmópolis de Minas\", \"Carneirinho\", \"Carrancas\",\r\n" + 
			"					\"Carvalhópolis\", \"Carvalhos\", \"Casa Grande\",\r\n" + 
			"					\"Cascalho Rico\", \"Cássia\", \"Cataguases\", \"Catas Altas\",\r\n" + 
			"					\"Catas Altas da Noruega\", \"Catuji\", \"Catuti\", \"Caxambu\",\r\n" + 
			"					\"Cedro do Abaeté\", \"Central de Minas\", \"Centralina\",\r\n" + 
			"					\"Chácara\", \"Chalé\", \"Chapada do Norte\", \"Chapada Gaúcha\",\r\n" + 
			"					\"Chiador\", \"Cipotânea\", \"Claraval\", \"Claro dos Poções\",\r\n" + 
			"					\"Cláudio\", \"Coimbra\", \"Coluna\", \"Comendador Gomes\",\r\n" + 
			"					\"Comercinho\", \"Conceição da Aparecida\",\r\n" + 
			"					\"Conceição da Barra de Minas\", \"Conceição das Alagoas\",\r\n" + 
			"					\"Conceição das Pedras\", \"Conceição de Ipanema\",\r\n" + 
			"					\"Conceição do Mato Dentro\", \"Conceição do Pará\",\r\n" + 
			"					\"Conceição do Rio Verde\", \"Conceição dos Ouros\",\r\n" + 
			"					\"Cônego Marinho\", \"Confins\", \"Congonhal\", \"Congonhas\",\r\n" + 
			"					\"Congonhas do Norte\", \"Conquista\", \"Conselheiro Lafaiete\",\r\n" + 
			"					\"Conselheiro Pena\", \"Consolação\", \"Contagem\", \"Coqueiral\",\r\n" + 
			"					\"Coração de Jesus\", \"Cordisburgo\", \"Cordislândia\",\r\n" + 
			"					\"Corinto\", \"Coroaci\", \"Coromandel\", \"Coronel Fabriciano\",\r\n" + 
			"					\"Coronel Murta\", \"Coronel Pacheco\",\r\n" + 
			"					\"Coronel Xavier Chaves\", \"Córrego Danta\",\r\n" + 
			"					\"Córrego do Bom Jesus\", \"Córrego Fundo\", \"Córrego Novo\",\r\n" + 
			"					\"Couto de Magalhães de Minas\", \"Crisólita\", \"Cristais\",\r\n" + 
			"					\"Cristália\", \"Cristiano Otoni\", \"Cristina\", \"Crucilândia\",\r\n" + 
			"					\"Cruzeiro da Fortaleza\", \"Cruzília\", \"Cuparaque\",\r\n" + 
			"					\"Curral de Dentro\", \"Curvelo\", \"Datas\", \"Delfim Moreira\",\r\n" + 
			"					\"Delfinópolis\", \"Delta\", \"Descoberto\",\r\n" + 
			"					\"Desterro de Entre Rios\", \"Desterro do Melo\", \"Diamantina\",\r\n" + 
			"					\"Diogo de Vasconcelos\", \"Dionísio\", \"Divinésia\", \"Divino\",\r\n" + 
			"					\"Divino das Laranjeiras\", \"Divinolândia de Minas\",\r\n" + 
			"					\"Divinópolis\", \"Divisa Alegre\", \"Divisa Nova\",\r\n" + 
			"					\"Divisópolis\", \"Dom Bosco\", \"Dom Cavati\", \"Dom Joaquim\",\r\n" + 
			"					\"Dom Silvério\", \"Dom Viçoso\", \"Dona Euzébia\",\r\n" + 
			"					\"Dores de Campos\", \"Dores de Guanhães\", \"Dores do Indaiá\",\r\n" + 
			"					\"Dores do Turvo\", \"Doresópolis\", \"Douradoquara\", \"Durandé\",\r\n" + 
			"					\"Elói Mendes\", \"Engenheiro Caldas\", \"Engenheiro Navarro\",\r\n" + 
			"					\"Entre Folhas\", \"Entre Rios de Minas\", \"Ervália\",\r\n" + 
			"					\"Esmeraldas\", \"Espera Feliz\", \"Espinosa\",\r\n" + 
			"					\"Espírito Santo do Dourado\", \"Estiva\", \"Estrela Dalva\",\r\n" + 
			"					\"Estrela do Indaiá\", \"Estrela do Sul\", \"Eugenópolis\",\r\n" + 
			"					\"Ewbank da Câmara\", \"Extrema\", \"Fama\", \"Faria Lemos\",\r\n" + 
			"					\"Felício dos Santos\", \"Felisburgo\", \"Felixlândia\",\r\n" + 
			"					\"Fernandes Tourinho\", \"Ferros\", \"Fervedouro\", \"Florestal\",\r\n" + 
			"					\"Formiga\", \"Formoso\", \"Fortaleza de Minas\",\r\n" + 
			"					\"Fortuna de Minas\", \"Francisco Badaró\", \"Francisco Dumont\",\r\n" + 
			"					\"Francisco Sá\", \"Franciscópolis\", \"Frei Gaspar\",\r\n" + 
			"					\"Frei Inocêncio\", \"Frei Lagonegro\", \"Fronteira\",\r\n" + 
			"					\"Fronteira dos Vales\", \"Fruta de Leite\", \"Frutal\",\r\n" + 
			"					\"Funilândia\", \"Galiléia\", \"Gameleiras\", \"Glaucilândia\",\r\n" + 
			"					\"Goiabeira\", \"Goianá\", \"Gonçalves\", \"Gonzaga\", \"Gouveia\",\r\n" + 
			"					\"Governador Valadares\", \"Grão Mogol\", \"Grupiara\",\r\n" + 
			"					\"Guanhães\", \"Guapé\", \"Guaraciaba\", \"Guaraciama\",\r\n" + 
			"					\"Guaranésia\", \"Guarani\", \"Guarará\", \"Guarda-Mor\",\r\n" + 
			"					\"Guaxupé\", \"Guidoval\", \"Guimarânia\", \"Guiricema\",\r\n" + 
			"					\"Gurinhatã\", \"Heliodora\", \"Iapu\", \"Ibertioga\", \"Ibiá\",\r\n" + 
			"					\"Ibiaí\", \"Ibiracatu\", \"Ibiraci\", \"Ibirité\",\r\n" + 
			"					\"Ibitiúra de Minas\", \"Ibituruna\", \"Icaraí de Minas\",\r\n" + 
			"					\"Igarapé\", \"Igaratinga\", \"Iguatama\", \"Ijaci\", \"Ilicínea\",\r\n" + 
			"					\"Imbé de Minas\", \"Inconfidentes\", \"Indaiabira\",\r\n" + 
			"					\"Indianópolis\", \"Ingaí\", \"Inhapim\", \"Inhaúma\", \"Inimutaba\",\r\n" + 
			"					\"Ipaba\", \"Ipanema\", \"Ipatinga\", \"Ipiaçu\", \"Ipuiúna\",\r\n" + 
			"					\"Iraí de Minas\", \"Itabira\", \"Itabirinha de Mantena\",\r\n" + 
			"					\"Itabirito\", \"Itacambira\", \"Itacarambi\", \"Itaguara\",\r\n" + 
			"					\"Itaipé\", \"Itajubá\", \"Itamarandiba\", \"Itamarati de Minas\",\r\n" + 
			"					\"Itambacuri\", \"Itambé do Mato Dentro\", \"Itamogi\",\r\n" + 
			"					\"Itamonte\", \"Itanhandu\", \"Itanhomi\", \"Itaobim\",\r\n" + 
			"					\"Itapagipe\", \"Itapecerica\", \"Itapeva\", \"Itatiaiuçu\",\r\n" + 
			"					\"Itaú de Minas\", \"Itaúna\", \"Itaverava\", \"Itinga\", \"Itueta\",\r\n" + 
			"					\"Ituiutaba\", \"Itumirim\", \"Iturama\", \"Itutinga\",\r\n" + 
			"					\"Jaboticatubas\", \"Jacinto\", \"Jacuí\", \"Jacutinga\",\r\n" + 
			"					\"Jaguaraçu\", \"Jaíba\", \"Jampruca\", \"Janaúba\", \"Januária\",\r\n" + 
			"					\"Japaraíba\", \"Japonvar\", \"Jeceaba\", \"Jenipapo de Minas\",\r\n" + 
			"					\"Jequeri\", \"Jequitaí\", \"Jequitibá\", \"Jequitinhonha\",\r\n" + 
			"					\"Jesuânia\", \"Joaíma\", \"Joanésia\", \"João Monlevade\",\r\n" + 
			"					\"João Pinheiro\", \"Joaquim Felício\", \"Jordânia\",\r\n" + 
			"					\"José Gonçalves de Minas\", \"José Raydan\", \"Josenópolis\",\r\n" + 
			"					\"Juatuba\", \"Juiz de Fora\", \"Juramento\", \"Juruaia\",\r\n" + 
			"					\"Juvenília\", \"Ladainha\", \"Lagamar\", \"Lagoa da Prata\",\r\n" + 
			"					\"Lagoa dos Patos\", \"Lagoa Dourada\", \"Lagoa Formosa\",\r\n" + 
			"					\"Lagoa Grande\", \"Lagoa Santa\", \"Lajinha\", \"Lambari\",\r\n" + 
			"					\"Lamim\", \"Laranjal\", \"Lassance\", \"Lavras\",\r\n" + 
			"					\"Leandro Ferreira\", \"Leme do Prado\", \"Leopoldina\",\r\n" + 
			"					\"Liberdade\", \"Lima Duarte\", \"Limeira do Oeste\", \"Lontra\",\r\n" + 
			"					\"Luisburgo\", \"Luislândia\", \"Luminárias\", \"Luz\",\r\n" + 
			"					\"Machacalis\", \"Machado\", \"Madre de Deus de Minas\",\r\n" + 
			"					\"Malacacheta\", \"Mamonas\", \"Manga\", \"Manhuaçu\",\r\n" + 
			"					\"Manhumirim\", \"Mantena\", \"Mar de Espanha\", \"Maravilhas\",\r\n" + 
			"					\"Maria da Fé\", \"Mariana\", \"Marilac\", \"Mário Campos\",\r\n" + 
			"					\"Maripá de Minas\", \"Marliéria\", \"Marmelópolis\",\r\n" + 
			"					\"Martinho Campos\", \"Martins Soares\", \"Mata Verde\",\r\n" + 
			"					\"Materlândia\", \"Mateus Leme\", \"Mathias Lobato\",\r\n" + 
			"					\"Matias Barbosa\", \"Matias Cardoso\", \"Matipó\", \"Mato Verde\",\r\n" + 
			"					\"Matozinhos\", \"Matutina\", \"Medeiros\", \"Medina\",\r\n" + 
			"					\"Mendes Pimentel\", \"Mercês\", \"Mesquita\", \"Minas Novas\",\r\n" + 
			"					\"Minduri\", \"Mirabela\", \"Miradouro\", \"Miraí\", \"Miravânia\",\r\n" + 
			"					\"Moeda\", \"Moema\", \"Monjolos\", \"Monsenhor Paulo\",\r\n" + 
			"					\"Montalvânia\", \"Monte Alegre de Minas\", \"Monte Azul\",\r\n" + 
			"					\"Monte Belo\", \"Monte Carmelo\", \"Monte Formoso\",\r\n" + 
			"					\"Monte Santo de Minas\", \"Monte Sião\", \"Montes Claros\",\r\n" + 
			"					\"Montezuma\", \"Morada Nova de Minas\", \"Morro da Garça\",\r\n" + 
			"					\"Morro do Pilar\", \"Munhoz\", \"Muriaé\", \"Mutum\",\r\n" + 
			"					\"Muzambinho\", \"Nacip Raydan\", \"Nanuque\", \"Naque\",\r\n" + 
			"					\"Natalândia\", \"Natércia\", \"Nazareno\", \"Nepomuceno\",\r\n" + 
			"					\"Ninheira\", \"Nova Belém\", \"Nova Era\", \"Nova Lima\",\r\n" + 
			"					\"Nova Módica\", \"Nova Ponte\", \"Nova Porteirinha\",\r\n" + 
			"					\"Nova Resende\", \"Nova Serrana\", \"Nova União\",\r\n" + 
			"					\"Novo Cruzeiro\", \"Novo Oriente de Minas\", \"Novorizonte\",\r\n" + 
			"					\"Olaria\", \"Olhos-d'Água\", \"Olímpio Noronha\", \"Oliveira\",\r\n" + 
			"					\"Oliveira Fortes\", \"Onça de Pitangui\", \"Oratórios\",\r\n" + 
			"					\"Orizânia\", \"Ouro Branco\", \"Ouro Fino\", \"Ouro Preto\",\r\n" + 
			"					\"Ouro Verde de Minas\", \"Padre Carvalho\", \"Padre Paraíso\",\r\n" + 
			"					\"Pai Pedro\", \"Paineiras\", \"Pains\", \"Paiva\", \"Palma\",\r\n" + 
			"					\"Palmópolis\", \"Papagaios\", \"Pará de Minas\", \"Paracatu\",\r\n" + 
			"					\"Paraguaçu\", \"Paraisópolis\", \"Paraopeba\", \"Passa Quatro\",\r\n" + 
			"					\"Passa Tempo\", \"Passa-Vinte\", \"Passabém\", \"Passos\",\r\n" + 
			"					\"Patis\", \"Patos de Minas\", \"Patrocínio\",\r\n" + 
			"					\"Patrocínio do Muriaé\", \"Paula Cândido\", \"Paulistas\",\r\n" + 
			"					\"Pavão\", \"Peçanha\", \"Pedra Azul\", \"Pedra Bonita\",\r\n" + 
			"					\"Pedra do Anta\", \"Pedra do Indaiá\", \"Pedra Dourada\",\r\n" + 
			"					\"Pedralva\", \"Pedras de Maria da Cruz\", \"Pedrinópolis\",\r\n" + 
			"					\"Pedro Leopoldo\", \"Pedro Teixeira\", \"Pequeri\", \"Pequi\",\r\n" + 
			"					\"Perdigão\", \"Perdizes\", \"Perdões\", \"Periquito\", \"Pescador\",\r\n" + 
			"					\"Piau\", \"Piedade de Caratinga\", \"Piedade de Ponte Nova\",\r\n" + 
			"					\"Piedade do Rio Grande\", \"Piedade dos Gerais\", \"Pimenta\",\r\n" + 
			"					\"Pingo-d'Água\", \"Pintópolis\", \"Piracema\", \"Pirajuba\",\r\n" + 
			"					\"Piranga\", \"Piranguçu\", \"Piranguinho\", \"Pirapetinga\",\r\n" + 
			"					\"Pirapora\", \"Piraúba\", \"Pitangui\", \"Piumhi\", \"Planura\",\r\n" + 
			"					\"Poço Fundo\", \"Poços de Caldas\", \"Pocrane\", \"Pompéu\",\r\n" + 
			"					\"Ponte Nova\", \"Ponto Chique\", \"Ponto dos Volantes\",\r\n" + 
			"					\"Porteirinha\", \"Porto Firme\", \"Poté\", \"Pouso Alegre\",\r\n" + 
			"					\"Pouso Alto\", \"Prados\", \"Prata\", \"Pratápolis\", \"Pratinha\",\r\n" + 
			"					\"Presidente Bernardes\", \"Presidente Juscelino\",\r\n" + 
			"					\"Presidente Kubitschek\", \"Presidente Olegário\",\r\n" + 
			"					\"Prudente de Morais\", \"Quartel Geral\", \"Queluzito\",\r\n" + 
			"					\"Raposos\", \"Raul Soares\", \"Recreio\", \"Reduto\",\r\n" + 
			"					\"Resende Costa\", \"Resplendor\", \"Ressaquinha\", \"Riachinho\",\r\n" + 
			"					\"Riacho dos Machados\", \"Ribeirão das Neves\",\r\n" + 
			"					\"Ribeirão Vermelho\", \"Rio Acima\", \"Rio Casca\",\r\n" + 
			"					\"Rio do Prado\", \"Rio Doce\", \"Rio Espera\", \"Rio Manso\",\r\n" + 
			"					\"Rio Novo\", \"Rio Paranaíba\", \"Rio Pardo de Minas\",\r\n" + 
			"					\"Rio Piracicaba\", \"Rio Pomba\", \"Rio Preto\", \"Rio Vermelho\",\r\n" + 
			"					\"Ritápolis\", \"Rochedo de Minas\", \"Rodeiro\", \"Romaria\",\r\n" + 
			"					\"Rosário da Limeira\", \"Rubelita\", \"Rubim\", \"Sabará\",\r\n" + 
			"					\"Sabinópolis\", \"Sacramento\", \"Salinas\", \"Salto da Divisa\",\r\n" + 
			"					\"Santa Bárbara\", \"Santa Bárbara do Leste\",\r\n" + 
			"					\"Santa Bárbara do Monte Verde\", \"Santa Bárbara do Tugúrio\",\r\n" + 
			"					\"Santa Cruz de Minas\", \"Santa Cruz de Salinas\",\r\n" + 
			"					\"Santa Cruz do Escalvado\", \"Santa Efigênia de Minas\",\r\n" + 
			"					\"Santa Fé de Minas\", \"Santa Helena de Minas\",\r\n" + 
			"					\"Santa Juliana\", \"Santa Luzia\", \"Santa Margarida\",\r\n" + 
			"					\"Santa Maria de Itabira\", \"Santa Maria do Salto\",\r\n" + 
			"					\"Santa Maria do Suaçuí\", \"Santa Rita de Caldas\",\r\n" + 
			"					\"Santa Rita de Ibitipoca\", \"Santa Rita de Jacutinga\",\r\n" + 
			"					\"Santa Rita de Minas\", \"Santa Rita do Itueto\",\r\n" + 
			"					\"Santa Rita do Sapucaí\", \"Santa Rosa da Serra\",\r\n" + 
			"					\"Santa Vitória\", \"Santana da Vargem\",\r\n" + 
			"					\"Santana de Cataguases\", \"Santana de Pirapama\",\r\n" + 
			"					\"Santana do Deserto\", \"Santana do Garambéu\",\r\n" + 
			"					\"Santana do Jacaré\", \"Santana do Manhuaçu\",\r\n" + 
			"					\"Santana do Paraíso\", \"Santana do Riacho\",\r\n" + 
			"					\"Santana dos Montes\", \"Santo Antônio do Amparo\",\r\n" + 
			"					\"Santo Antônio do Aventureiro\", \"Santo Antônio do Grama\",\r\n" + 
			"					\"Santo Antônio do Itambé\", \"Santo Antônio do Jacinto\",\r\n" + 
			"					\"Santo Antônio do Monte\", \"Santo Antônio do Retiro\",\r\n" + 
			"					\"Santo Antônio do Rio Abaixo\", \"Santo Hipólito\",\r\n" + 
			"					\"Santos Dumont\", \"São Bento Abade\", \"São Brás do Suaçuí\",\r\n" + 
			"					\"São Domingos das Dores\", \"São Domingos do Prata\",\r\n" + 
			"					\"São Félix de Minas\", \"São Francisco\",\r\n" + 
			"					\"São Francisco de Paula\", \"São Francisco de Sales\",\r\n" + 
			"					\"São Francisco do Glória\", \"São Geraldo\",\r\n" + 
			"					\"São Geraldo da Piedade\", \"São Geraldo do Baixio\",\r\n" + 
			"					\"São Gonçalo do Abaeté\", \"São Gonçalo do Pará\",\r\n" + 
			"					\"São Gonçalo do Rio Abaixo\", \"São Gonçalo do Rio Preto\",\r\n" + 
			"					\"São Gonçalo do Sapucaí\", \"São Gotardo\",\r\n" + 
			"					\"São João Batista do Glória\", \"São João da Lagoa\",\r\n" + 
			"					\"São João da Mata\", \"São João da Ponte\",\r\n" + 
			"					\"São João das Missões\", \"São João del Rei\",\r\n" + 
			"					\"São João do Manhuaçu\", \"São João do Manteninha\",\r\n" + 
			"					\"São João do Oriente\", \"São João do Pacuí\",\r\n" + 
			"					\"São João do Paraíso\", \"São João Evangelista\",\r\n" + 
			"					\"São João Nepomuceno\", \"São Joaquim de Bicas\",\r\n" + 
			"					\"São José da Barra\", \"São José da Lapa\",\r\n" + 
			"					\"São José da Safira\", \"São José da Varginha\",\r\n" + 
			"					\"São José do Alegre\", \"São José do Divino\",\r\n" + 
			"					\"São José do Goiabal\", \"São José do Jacuri\",\r\n" + 
			"					\"São José do Mantimento\", \"São Lourenço\",\r\n" + 
			"					\"São Miguel do Anta\", \"São Pedro da União\",\r\n" + 
			"					\"São Pedro do Suaçuí\", \"São Pedro dos Ferros\", \"São Romão\",\r\n" + 
			"					\"São Roque de Minas\", \"São Sebastião da Bela Vista\",\r\n" + 
			"					\"São Sebastião da Vargem Alegre\", \"São Sebastião do Anta\",\r\n" + 
			"					\"São Sebastião do Maranhão\", \"São Sebastião do Oeste\",\r\n" + 
			"					\"São Sebastião do Paraíso\", \"São Sebastião do Rio Preto\",\r\n" + 
			"					\"São Sebastião do Rio Verde\", \"São Thomé das Letras\",\r\n" + 
			"					\"São Tiago\", \"São Tomás de Aquino\", \"São Vicente de Minas\",\r\n" + 
			"					\"Sapucaí-Mirim\", \"Sardoá\", \"Sarzedo\", \"Sem-Peixe\",\r\n" + 
			"					\"Senador Amaral\", \"Senador Cortes\", \"Senador Firmino\",\r\n" + 
			"					\"Senador José Bento\", \"Senador Modestino Gonçalves\",\r\n" + 
			"					\"Senhora de Oliveira\", \"Senhora do Porto\",\r\n" + 
			"					\"Senhora dos Remédios\", \"Sericita\", \"Seritinga\",\r\n" + 
			"					\"Serra Azul de Minas\", \"Serra da Saudade\",\r\n" + 
			"					\"Serra do Salitre\", \"Serra dos Aimorés\", \"Serrania\",\r\n" + 
			"					\"Serranópolis de Minas\", \"Serranos\", \"Serro\",\r\n" + 
			"					\"Sete Lagoas\", \"Setubinha\", \"Silveirânia\", \"Silvianópolis\",\r\n" + 
			"					\"Simão Pereira\", \"Simonésia\", \"Sobrália\",\r\n" + 
			"					\"Soledade de Minas\", \"Tabuleiro\", \"Taiobeiras\", \"Taparuba\",\r\n" + 
			"					\"Tapira\", \"Tapiraí\", \"Taquaraçu de Minas\", \"Tarumirim\",\r\n" + 
			"					\"Teixeiras\", \"Teófilo Otoni\", \"Timóteo\", \"Tiradentes\",\r\n" + 
			"					\"Tiros\", \"Tocantins\", \"Tocos do Moji\", \"Toledo\", \"Tombos\",\r\n" + 
			"					\"Três Corações\", \"Três Marias\", \"Três Pontas\",\r\n" + 
			"					\"Tumiritinga\", \"Tupaciguara\", \"Turmalina\", \"Turvolândia\",\r\n" + 
			"					\"Ubá\", \"Ubaí\", \"Ubaporanga\", \"Uberaba\", \"Uberlândia\",\r\n" + 
			"					\"Umburatiba\", \"Unaí\", \"União de Minas\", \"Uruana de Minas\",\r\n" + 
			"					\"Urucânia\", \"Urucuia\", \"Vargem Alegre\", \"Vargem Bonita\",\r\n" + 
			"					\"Vargem Grande do Rio Pardo\", \"Varginha\",\r\n" + 
			"					\"Varjão de Minas\", \"Várzea da Palma\", \"Varzelândia\",\r\n" + 
			"					\"Vazante\", \"Verdelândia\", \"Veredinha\", \"Veríssimo\",\r\n" + 
			"					\"Vermelho Novo\", \"Vespasiano\", \"Viçosa\", \"Vieiras\",\r\n" + 
			"					\"Virgem da Lapa\", \"Virgínia\", \"Virginópolis\",\r\n" + 
			"					\"Virgolândia\", \"Visconde do Rio Branco\", \"Volta Grande\",\r\n" + 
			"					\"Wenceslau Braz\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"MS\",\r\n" + 
			"			\"nome\" : \"Mato Grosso do Sul\",\r\n" + 
			"			\"cidades\" : [ \"Água Clara\", \"Alcinópolis\", \"Amambaí\", \"Anastácio\",\r\n" + 
			"					\"Anaurilândia\", \"Angélica\", \"Antônio João\",\r\n" + 
			"					\"Aparecida do Taboado\", \"Aquidauana\", \"Aral Moreira\",\r\n" + 
			"					\"Bandeirantes\", \"Bataguassu\", \"Bataiporã\", \"Bela Vista\",\r\n" + 
			"					\"Bodoquena\", \"Bonito\", \"Brasilândia\", \"Caarapó\", \"Camapuã\",\r\n" + 
			"					\"Campo Grande\", \"Caracol\", \"Cassilândia\",\r\n" + 
			"					\"Chapadão do Sul\", \"Corguinho\", \"Coronel Sapucaia\",\r\n" + 
			"					\"Corumbá\", \"Costa Rica\", \"Coxim\", \"Deodápolis\",\r\n" + 
			"					\"Dois Irmãos do Buriti\", \"Douradina\", \"Dourados\",\r\n" + 
			"					\"Eldorado\", \"Fátima do Sul\", \"Glória de Dourados\",\r\n" + 
			"					\"Guia Lopes da Laguna\", \"Iguatemi\", \"Inocência\", \"Itaporã\",\r\n" + 
			"					\"Itaquiraí\", \"Ivinhema\", \"Japorã\", \"Jaraguari\", \"Jardim\",\r\n" + 
			"					\"Jateí\", \"Juti\", \"Ladário\", \"Laguna Carapã\", \"Maracaju\",\r\n" + 
			"					\"Miranda\", \"Mundo Novo\", \"Naviraí\", \"Nioaque\",\r\n" + 
			"					\"Nova Alvorada do Sul\", \"Nova Andradina\",\r\n" + 
			"					\"Novo Horizonte do Sul\", \"Paranaíba\", \"Paranhos\",\r\n" + 
			"					\"Pedro Gomes\", \"Ponta Porã\", \"Porto Murtinho\",\r\n" + 
			"					\"Ribas do Rio Pardo\", \"Rio Brilhante\", \"Rio Negro\",\r\n" + 
			"					\"Rio Verde de Mato Grosso\", \"Rochedo\",\r\n" + 
			"					\"Santa Rita do Pardo\", \"São Gabriel do Oeste\", \"Selvíria\",\r\n" + 
			"					\"Sete Quedas\", \"Sidrolândia\", \"Sonora\", \"Tacuru\",\r\n" + 
			"					\"Taquarussu\", \"Terenos\", \"Três Lagoas\", \"Vicentina\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"MT\",\r\n" + 
			"			\"nome\" : \"Mato Grosso\",\r\n" + 
			"			\"cidades\" : [ \"Acorizal\", \"Água Boa\", \"Alta Floresta\",\r\n" + 
			"					\"Alto Araguaia\", \"Alto Boa Vista\", \"Alto Garças\",\r\n" + 
			"					\"Alto Paraguai\", \"Alto Taquari\", \"Apiacás\", \"Araguaiana\",\r\n" + 
			"					\"Araguainha\", \"Araputanga\", \"Arenápolis\", \"Aripuanã\",\r\n" + 
			"					\"Barão de Melgaço\", \"Barra do Bugres\", \"Barra do Garças\",\r\n" + 
			"					\"Bom Jesus do Araguaia\", \"Brasnorte\", \"Cáceres\",\r\n" + 
			"					\"Campinápolis\", \"Campo Novo do Parecis\", \"Campo Verde\",\r\n" + 
			"					\"Campos de Júlio\", \"Canabrava do Norte\", \"Canarana\",\r\n" + 
			"					\"Carlinda\", \"Castanheira\", \"Chapada dos Guimarães\",\r\n" + 
			"					\"Cláudia\", \"Cocalinho\", \"Colíder\", \"Colniza\", \"Comodoro\",\r\n" + 
			"					\"Confresa\", \"Conquista d'Oeste\", \"Cotriguaçu\",\r\n" + 
			"					\"Curvelândia\", \"Cuiabá\", \"Denise\", \"Diamantino\",\r\n" + 
			"					\"Dom Aquino\", \"Feliz Natal\", \"Figueirópolis d'Oeste\",\r\n" + 
			"					\"Gaúcha do Norte\", \"General Carneiro\", \"Glória d'Oeste\",\r\n" + 
			"					\"Guarantã do Norte\", \"Guiratinga\", \"Indiavaí\", \"Itaúba\",\r\n" + 
			"					\"Itiquira\", \"Jaciara\", \"Jangada\", \"Jauru\", \"Juara\",\r\n" + 
			"					\"Juína\", \"Juruena\", \"Juscimeira\", \"Lambari d'Oeste\",\r\n" + 
			"					\"Lucas do Rio Verde\", \"Luciára\", \"Marcelândia\", \"Matupá\",\r\n" + 
			"					\"Mirassol d'Oeste\", \"Nobres\", \"Nortelândia\",\r\n" + 
			"					\"Nossa Senhora do Livramento\", \"Nova Bandeirantes\",\r\n" + 
			"					\"Nova Brasilândia\", \"Nova Canãa do Norte\", \"Nova Guarita\",\r\n" + 
			"					\"Nova Lacerda\", \"Nova Marilândia\", \"Nova Maringá\",\r\n" + 
			"					\"Nova Monte Verde\", \"Nova Mutum\", \"Nova Nazaré\",\r\n" + 
			"					\"Nova Olímpia\", \"Nova Santa Helena\", \"Nova Ubiratã\",\r\n" + 
			"					\"Nova Xavantina\", \"Novo Horizonte do Norte\", \"Novo Mundo\",\r\n" + 
			"					\"Novo Santo Antônio\", \"Novo São Joaquim\", \"Paranaíta\",\r\n" + 
			"					\"Paranatinga\", \"Pedra Preta\", \"Peixoto de Azevedo\",\r\n" + 
			"					\"Planalto da Serra\", \"Poconé\", \"Pontal do Araguaia\",\r\n" + 
			"					\"Ponte Branca\", \"Pontes e Lacerda\",\r\n" + 
			"					\"Porto Alegre do Norte\", \"Porto dos Gaúchos\",\r\n" + 
			"					\"Porto Esperidião\", \"Porto Estrela\", \"Poxoréo\",\r\n" + 
			"					\"Primavera do Leste\", \"Querência\", \"Reserva do Cabaçal\",\r\n" + 
			"					\"Ribeirão Cascalheira\", \"Ribeirãozinho\", \"Rio Branco\",\r\n" + 
			"					\"Rondolândia\", \"Rondonópolis\", \"Rosário Oeste\",\r\n" + 
			"					\"Salto do Céu\", \"Santa Carmem\", \"Santa Cruz do Xingu\",\r\n" + 
			"					\"Santa Rita do Trivelato\", \"Santa Terezinha\",\r\n" + 
			"					\"Santo Afonso\", \"Santo Antônio do Leste\",\r\n" + 
			"					\"Santo Antônio do Leverger\", \"São Félix do Araguaia\",\r\n" + 
			"					\"São José do Povo\", \"São José do Rio Claro\",\r\n" + 
			"					\"São José do Xingu\", \"São José dos Quatro Marcos\",\r\n" + 
			"					\"São Pedro da Cipa\", \"Sapezal\", \"Serra Nova Dourada\",\r\n" + 
			"					\"Sinop\", \"Sorriso\", \"Tabaporã\", \"Tangará da Serra\",\r\n" + 
			"					\"Tapurah\", \"Terra Nova do Norte\", \"Tesouro\", \"Torixoréu\",\r\n" + 
			"					\"União do Sul\", \"Vale de São Domingos\", \"Várzea Grande\",\r\n" + 
			"					\"Vera\", \"Vila Bela da Santíssima Trindade\", \"Vila Rica\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"PA\",\r\n" + 
			"			\"nome\" : \"Pará\",\r\n" + 
			"			\"cidades\" : [ \"Abaetetuba\", \"Abel Figueiredo\", \"Acará\", \"Afuá\",\r\n" + 
			"					\"Água Azul do Norte\", \"Alenquer\", \"Almeirim\", \"Altamira\",\r\n" + 
			"					\"Anajás\", \"Ananindeua\", \"Anapu\", \"Augusto Corrêa\",\r\n" + 
			"					\"Aurora do Pará\", \"Aveiro\", \"Bagre\", \"Baião\", \"Bannach\",\r\n" + 
			"					\"Barcarena\", \"Belém\", \"Belterra\", \"Benevides\",\r\n" + 
			"					\"Bom Jesus do Tocantins\", \"Bonito\", \"Bragança\",\r\n" + 
			"					\"Brasil Novo\", \"Brejo Grande do Araguaia\", \"Breu Branco\",\r\n" + 
			"					\"Breves\", \"Bujaru\", \"Cachoeira do Arari\",\r\n" + 
			"					\"Cachoeira do Piriá\", \"Cametá\", \"Canaã dos Carajás\",\r\n" + 
			"					\"Capanema\", \"Capitão Poço\", \"Castanhal\", \"Chaves\",\r\n" + 
			"					\"Colares\", \"Conceição do Araguaia\", \"Concórdia do Pará\",\r\n" + 
			"					\"Cumaru do Norte\", \"Curionópolis\", \"Curralinho\", \"Curuá\",\r\n" + 
			"					\"Curuçá\", \"Dom Eliseu\", \"Eldorado dos Carajás\", \"Faro\",\r\n" + 
			"					\"Floresta do Araguaia\", \"Garrafão do Norte\",\r\n" + 
			"					\"Goianésia do Pará\", \"Gurupá\", \"Igarapé-Açu\",\r\n" + 
			"					\"Igarapé-Miri\", \"Inhangapi\", \"Ipixuna do Pará\", \"Irituia\",\r\n" + 
			"					\"Itaituba\", \"Itupiranga\", \"Jacareacanga\", \"Jacundá\",\r\n" + 
			"					\"Juruti\", \"Limoeiro do Ajuru\", \"Mãe do Rio\",\r\n" + 
			"					\"Magalhães Barata\", \"Marabá\", \"Maracanã\", \"Marapanim\",\r\n" + 
			"					\"Marituba\", \"Medicilândia\", \"Melgaço\", \"Mocajuba\", \"Moju\",\r\n" + 
			"					\"Monte Alegre\", \"Muaná\", \"Nova Esperança do Piriá\",\r\n" + 
			"					\"Nova Ipixuna\", \"Nova Timboteua\", \"Novo Progresso\",\r\n" + 
			"					\"Novo Repartimento\", \"Óbidos\", \"Oeiras do Pará\",\r\n" + 
			"					\"Oriximiná\", \"Ourém\", \"Ourilândia do Norte\", \"Pacajá\",\r\n" + 
			"					\"Palestina do Pará\", \"Paragominas\", \"Parauapebas\",\r\n" + 
			"					\"Pau d'Arco\", \"Peixe-Boi\", \"Piçarra\", \"Placas\",\r\n" + 
			"					\"Ponta de Pedras\", \"Portel\", \"Porto de Moz\", \"Prainha\",\r\n" + 
			"					\"Primavera\", \"Quatipuru\", \"Redenção\", \"Rio Maria\",\r\n" + 
			"					\"Rondon do Pará\", \"Rurópolis\", \"Salinópolis\", \"Salvaterra\",\r\n" + 
			"					\"Santa Bárbara do Pará\", \"Santa Cruz do Arari\",\r\n" + 
			"					\"Santa Isabel do Pará\", \"Santa Luzia do Pará\",\r\n" + 
			"					\"Santa Maria das Barreiras\", \"Santa Maria do Pará\",\r\n" + 
			"					\"Santana do Araguaia\", \"Santarém\", \"Santarém Novo\",\r\n" + 
			"					\"Santo Antônio do Tauá\", \"São Caetano de Odivela\",\r\n" + 
			"					\"São Domingos do Araguaia\", \"São Domingos do Capim\",\r\n" + 
			"					\"São Félix do Xingu\", \"São Francisco do Pará\",\r\n" + 
			"					\"São Geraldo do Araguaia\", \"São João da Ponta\",\r\n" + 
			"					\"São João de Pirabas\", \"São João do Araguaia\",\r\n" + 
			"					\"São Miguel do Guamá\", \"São Sebastião da Boa Vista\",\r\n" + 
			"					\"Sapucaia\", \"Senador José Porfírio\", \"Soure\", \"Tailândia\",\r\n" + 
			"					\"Terra Alta\", \"Terra Santa\", \"Tomé-Açu\", \"Tracuateua\",\r\n" + 
			"					\"Trairão\", \"Tucumã\", \"Tucuruí\", \"Ulianópolis\", \"Uruará\",\r\n" + 
			"					\"Vigia\", \"Viseu\", \"Vitória do Xingu\", \"Xinguara\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"PB\",\r\n" + 
			"			\"nome\" : \"Paraíba\",\r\n" + 
			"			\"cidades\" : [ \"Água Branca\", \"Aguiar\", \"Alagoa Grande\",\r\n" + 
			"					\"Alagoa Nova\", \"Alagoinha\", \"Alcantil\",\r\n" + 
			"					\"Algodão de Jandaíra\", \"Alhandra\", \"Amparo\", \"Aparecida\",\r\n" + 
			"					\"Araçagi\", \"Arara\", \"Araruna\", \"Areia\",\r\n" + 
			"					\"Areia de Baraúnas\", \"Areial\", \"Aroeiras\", \"Assunção\",\r\n" + 
			"					\"Baía da Traição\", \"Bananeiras\", \"Baraúna\",\r\n" + 
			"					\"Barra de Santa Rosa\", \"Barra de Santana\",\r\n" + 
			"					\"Barra de São Miguel\", \"Bayeux\", \"Belém\",\r\n" + 
			"					\"Belém do Brejo do Cruz\", \"Bernardino Batista\",\r\n" + 
			"					\"Boa Ventura\", \"Boa Vista\", \"Bom Jesus\", \"Bom Sucesso\",\r\n" + 
			"					\"Bonito de Santa Fé\", \"Boqueirão\", \"Borborema\",\r\n" + 
			"					\"Brejo do Cruz\", \"Brejo dos Santos\", \"Caaporã\",\r\n" + 
			"					\"Cabaceiras\", \"Cabedelo\", \"Cachoeira dos Índios\",\r\n" + 
			"					\"Cacimba de Areia\", \"Cacimba de Dentro\", \"Cacimbas\",\r\n" + 
			"					\"Caiçara\", \"Cajazeiras\", \"Cajazeirinhas\", \"Caldas Brandão\",\r\n" + 
			"					\"Camalaú\", \"Campina Grande\", \"Campo de Santana\", \"Capim\",\r\n" + 
			"					\"Caraúbas\", \"Carrapateira\", \"Casserengue\", \"Catingueira\",\r\n" + 
			"					\"Catolé do Rocha\", \"Caturité\", \"Conceição\", \"Condado\",\r\n" + 
			"					\"Conde\", \"Congo\", \"Coremas\", \"Coxixola\",\r\n" + 
			"					\"Cruz do Espírito Santo\", \"Cubati\", \"Cuité\",\r\n" + 
			"					\"Cuité de Mamanguape\", \"Cuitegi\", \"Curral de Cima\",\r\n" + 
			"					\"Curral Velho\", \"Damião\", \"Desterro\", \"Diamante\",\r\n" + 
			"					\"Dona Inês\", \"Duas Estradas\", \"Emas\", \"Esperança\",\r\n" + 
			"					\"Fagundes\", \"Frei Martinho\", \"Gado Bravo\", \"Guarabira\",\r\n" + 
			"					\"Gurinhém\", \"Gurjão\", \"Ibiara\", \"Igaracy\", \"Imaculada\",\r\n" + 
			"					\"Ingá\", \"Itabaiana\", \"Itaporanga\", \"Itapororoca\",\r\n" + 
			"					\"Itatuba\", \"Jacaraú\", \"Jericó\", \"João Pessoa\",\r\n" + 
			"					\"Juarez Távora\", \"Juazeirinho\", \"Junco do Seridó\",\r\n" + 
			"					\"Juripiranga\", \"Juru\", \"Lagoa\", \"Lagoa de Dentro\",\r\n" + 
			"					\"Lagoa Seca\", \"Lastro\", \"Livramento\", \"Logradouro\",\r\n" + 
			"					\"Lucena\", \"Mãe d'Água\", \"Malta\", \"Mamanguape\", \"Manaíra\",\r\n" + 
			"					\"Marcação\", \"Mari\", \"Marizópolis\", \"Massaranduba\",\r\n" + 
			"					\"Mataraca\", \"Matinhas\", \"Mato Grosso\", \"Maturéia\",\r\n" + 
			"					\"Mogeiro\", \"Montadas\", \"Monte Horebe\", \"Monteiro\",\r\n" + 
			"					\"Mulungu\", \"Natuba\", \"Nazarezinho\", \"Nova Floresta\",\r\n" + 
			"					\"Nova Olinda\", \"Nova Palmeira\", \"Olho d'Água\", \"Olivedos\",\r\n" + 
			"					\"Ouro Velho\", \"Parari\", \"Passagem\", \"Patos\", \"Paulista\",\r\n" + 
			"					\"Pedra Branca\", \"Pedra Lavrada\", \"Pedras de Fogo\",\r\n" + 
			"					\"Pedro Régis\", \"Piancó\", \"Picuí\", \"Pilar\", \"Pilões\",\r\n" + 
			"					\"Pilõezinhos\", \"Pirpirituba\", \"Pitimbu\", \"Pocinhos\",\r\n" + 
			"					\"Poço Dantas\", \"Poço de José de Moura\", \"Pombal\", \"Prata\",\r\n" + 
			"					\"Princesa Isabel\", \"Puxinanã\", \"Queimadas\", \"Quixabá\",\r\n" + 
			"					\"Remígio\", \"Riachão\", \"Riachão do Bacamarte\",\r\n" + 
			"					\"Riachão do Poço\", \"Riacho de Santo Antônio\",\r\n" + 
			"					\"Riacho dos Cavalos\", \"Rio Tinto\", \"Salgadinho\",\r\n" + 
			"					\"Salgado de São Félix\", \"Santa Cecília\", \"Santa Cruz\",\r\n" + 
			"					\"Santa Helena\", \"Santa Inês\", \"Santa Luzia\", \"Santa Rita\",\r\n" + 
			"					\"Santa Teresinha\", \"Santana de Mangueira\",\r\n" + 
			"					\"Santana dos Garrotes\", \"Santarém\", \"Santo André\",\r\n" + 
			"					\"São Bentinho\", \"São Bento\", \"São Domingos de Pombal\",\r\n" + 
			"					\"São Domingos do Cariri\", \"São Francisco\",\r\n" + 
			"					\"São João do Cariri\", \"São João do Rio do Peixe\",\r\n" + 
			"					\"São João do Tigre\", \"São José da Lagoa Tapada\",\r\n" + 
			"					\"São José de Caiana\", \"São José de Espinharas\",\r\n" + 
			"					\"São José de Piranhas\", \"São José de Princesa\",\r\n" + 
			"					\"São José do Bonfim\", \"São José do Brejo do Cruz\",\r\n" + 
			"					\"São José do Sabugi\", \"São José dos Cordeiros\",\r\n" + 
			"					\"São José dos Ramos\", \"São Mamede\", \"São Miguel de Taipu\",\r\n" + 
			"					\"São Sebastião de Lagoa de Roça\",\r\n" + 
			"					\"São Sebastião do Umbuzeiro\", \"Sapé\", \"Seridó\",\r\n" + 
			"					\"Serra Branca\", \"Serra da Raiz\", \"Serra Grande\",\r\n" + 
			"					\"Serra Redonda\", \"Serraria\", \"Sertãozinho\", \"Sobrado\",\r\n" + 
			"					\"Solânea\", \"Soledade\", \"Sossêgo\", \"Sousa\", \"Sumé\",\r\n" + 
			"					\"Taperoá\", \"Tavares\", \"Teixeira\", \"Tenório\", \"Triunfo\",\r\n" + 
			"					\"Uiraúna\", \"Umbuzeiro\", \"Várzea\", \"Vieirópolis\",\r\n" + 
			"					\"Vista Serrana\", \"Zabelê\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"PE\",\r\n" + 
			"			\"nome\" : \"Pernambuco\",\r\n" + 
			"			\"cidades\" : [ \"Abreu e Lima\", \"Afogados da Ingazeira\", \"Afrânio\",\r\n" + 
			"					\"Agrestina\", \"Água Preta\", \"Águas Belas\", \"Alagoinha\",\r\n" + 
			"					\"Aliança\", \"Altinho\", \"Amaraji\", \"Angelim\", \"Araçoiaba\",\r\n" + 
			"					\"Araripina\", \"Arcoverde\", \"Barra de Guabiraba\",\r\n" + 
			"					\"Barreiros\", \"Belém de Maria\", \"Belém de São Francisco\",\r\n" + 
			"					\"Belo Jardim\", \"Betânia\", \"Bezerros\", \"Bodocó\",\r\n" + 
			"					\"Bom Conselho\", \"Bom Jardim\", \"Bonito\", \"Brejão\",\r\n" + 
			"					\"Brejinho\", \"Brejo da Madre de Deus\", \"Buenos Aires\",\r\n" + 
			"					\"Buíque\", \"Cabo de Santo Agostinho\", \"Cabrobó\",\r\n" + 
			"					\"Cachoeirinha\", \"Caetés\", \"Calçado\", \"Calumbi\",\r\n" + 
			"					\"Camaragibe\", \"Camocim de São Félix\", \"Camutanga\",\r\n" + 
			"					\"Canhotinho\", \"Capoeiras\", \"Carnaíba\",\r\n" + 
			"					\"Carnaubeira da Penha\", \"Carpina\", \"Caruaru\", \"Casinhas\",\r\n" + 
			"					\"Catende\", \"Cedro\", \"Chã de Alegria\", \"Chã Grande\",\r\n" + 
			"					\"Condado\", \"Correntes\", \"Cortês\", \"Cumaru\", \"Cupira\",\r\n" + 
			"					\"Custódia\", \"Dormentes\", \"Escada\", \"Exu\", \"Feira Nova\",\r\n" + 
			"					\"Fernando de Noronha\", \"Ferreiros\", \"Flores\", \"Floresta\",\r\n" + 
			"					\"Frei Miguelinho\", \"Gameleira\", \"Garanhuns\",\r\n" + 
			"					\"Glória do Goitá\", \"Goiana\", \"Granito\", \"Gravatá\", \"Iati\",\r\n" + 
			"					\"Ibimirim\", \"Ibirajuba\", \"Igarassu\", \"Iguaraci\", \"Inajá\",\r\n" + 
			"					\"Ingazeira\", \"Ipojuca\", \"Ipubi\", \"Itacuruba\", \"Itaíba\",\r\n" + 
			"					\"Itamaracá\", \"Itambé\", \"Itapetim\", \"Itapissuma\",\r\n" + 
			"					\"Itaquitinga\", \"Jaboatão dos Guararapes\", \"Jaqueira\",\r\n" + 
			"					\"Jataúba\", \"Jatobá\", \"João Alfredo\", \"Joaquim Nabuco\",\r\n" + 
			"					\"Jucati\", \"Jupi\", \"Jurema\", \"Lagoa do Carro\",\r\n" + 
			"					\"Lagoa do Itaenga\", \"Lagoa do Ouro\", \"Lagoa dos Gatos\",\r\n" + 
			"					\"Lagoa Grande\", \"Lajedo\", \"Limoeiro\", \"Macaparana\",\r\n" + 
			"					\"Machados\", \"Manari\", \"Maraial\", \"Mirandiba\",\r\n" + 
			"					\"Moreilândia\", \"Moreno\", \"Nazaré da Mata\", \"Olinda\",\r\n" + 
			"					\"Orobó\", \"Orocó\", \"Ouricuri\", \"Palmares\", \"Palmeirina\",\r\n" + 
			"					\"Panelas\", \"Paranatama\", \"Parnamirim\", \"Passira\",\r\n" + 
			"					\"Paudalho\", \"Paulista\", \"Pedra\", \"Pesqueira\",\r\n" + 
			"					\"Petrolândia\", \"Petrolina\", \"Poção\", \"Pombos\", \"Primavera\",\r\n" + 
			"					\"Quipapá\", \"Quixaba\", \"Recife\", \"Riacho das Almas\",\r\n" + 
			"					\"Ribeirão\", \"Rio Formoso\", \"Sairé\", \"Salgadinho\",\r\n" + 
			"					\"Salgueiro\", \"Saloá\", \"Sanharó\", \"Santa Cruz\",\r\n" + 
			"					\"Santa Cruz da Baixa Verde\", \"Santa Cruz do Capibaribe\",\r\n" + 
			"					\"Santa Filomena\", \"Santa Maria da Boa Vista\",\r\n" + 
			"					\"Santa Maria do Cambucá\", \"Santa Terezinha\",\r\n" + 
			"					\"São Benedito do Sul\", \"São Bento do Una\", \"São Caitano\",\r\n" + 
			"					\"São João\", \"São Joaquim do Monte\",\r\n" + 
			"					\"São José da Coroa Grande\", \"São José do Belmonte\",\r\n" + 
			"					\"São José do Egito\", \"São Lourenço da Mata\",\r\n" + 
			"					\"São Vicente Ferrer\", \"Serra Talhada\", \"Serrita\",\r\n" + 
			"					\"Sertânia\", \"Sirinhaém\", \"Solidão\", \"Surubim\", \"Tabira\",\r\n" + 
			"					\"Tacaimbó\", \"Tacaratu\", \"Tamandaré\",\r\n" + 
			"					\"Taquaritinga do Norte\", \"Terezinha\", \"Terra Nova\",\r\n" + 
			"					\"Timbaúba\", \"Toritama\", \"Tracunhaém\", \"Trindade\",\r\n" + 
			"					\"Triunfo\", \"Tupanatinga\", \"Tuparetama\", \"Venturosa\",\r\n" + 
			"					\"Verdejante\", \"Vertente do Lério\", \"Vertentes\", \"Vicência\",\r\n" + 
			"					\"Vitória de Santo Antão\", \"Xexéu\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"PI\",\r\n" + 
			"			\"nome\" : \"Piauí\",\r\n" + 
			"			\"cidades\" : [ \"Acauã\", \"Agricolândia\", \"Água Branca\",\r\n" + 
			"					\"Alagoinha do Piauí\", \"Alegrete do Piauí\", \"Alto Longá\",\r\n" + 
			"					\"Altos\", \"Alvorada do Gurguéia\", \"Amarante\",\r\n" + 
			"					\"Angical do Piauí\", \"Anísio de Abreu\", \"Antônio Almeida\",\r\n" + 
			"					\"Aroazes\", \"Arraial\", \"Assunção do Piauí\", \"Avelino Lopes\",\r\n" + 
			"					\"Baixa Grande do Ribeiro\", \"Barra d'Alcântara\", \"Barras\",\r\n" + 
			"					\"Barreiras do Piauí\", \"Barro Duro\", \"Batalha\",\r\n" + 
			"					\"Bela Vista do Piauí\", \"Belém do Piauí\", \"Beneditinos\",\r\n" + 
			"					\"Bertolínia\", \"Betânia do Piauí\", \"Boa Hora\", \"Bocaina\",\r\n" + 
			"					\"Bom Jesus\", \"Bom Princípio do Piauí\", \"Bonfim do Piauí\",\r\n" + 
			"					\"Boqueirão do Piauí\", \"Brasileira\", \"Brejo do Piauí\",\r\n" + 
			"					\"Buriti dos Lopes\", \"Buriti dos Montes\",\r\n" + 
			"					\"Cabeceiras do Piauí\", \"Cajazeiras do Piauí\",\r\n" + 
			"					\"Cajueiro da Praia\", \"Caldeirão Grande do Piauí\",\r\n" + 
			"					\"Campinas do Piauí\", \"Campo Alegre do Fidalgo\",\r\n" + 
			"					\"Campo Grande do Piauí\", \"Campo Largo do Piauí\",\r\n" + 
			"					\"Campo Maior\", \"Canavieira\", \"Canto do Buriti\",\r\n" + 
			"					\"Capitão de Campos\", \"Capitão Gervásio Oliveira\",\r\n" + 
			"					\"Caracol\", \"Caraúbas do Piauí\", \"Caridade do Piauí\",\r\n" + 
			"					\"Castelo do Piauí\", \"Caxingó\", \"Cocal\", \"Cocal de Telha\",\r\n" + 
			"					\"Cocal dos Alves\", \"Coivaras\", \"Colônia do Gurguéia\",\r\n" + 
			"					\"Colônia do Piauí\", \"Conceição do Canindé\",\r\n" + 
			"					\"Coronel José Dias\", \"Corrente\", \"Cristalândia do Piauí\",\r\n" + 
			"					\"Cristino Castro\", \"Curimatá\", \"Currais\",\r\n" + 
			"					\"Curral Novo do Piauí\", \"Curralinhos\", \"Demerval Lobão\",\r\n" + 
			"					\"Dirceu Arcoverde\", \"Dom Expedito Lopes\", \"Dom Inocêncio\",\r\n" + 
			"					\"Domingos Mourão\", \"Elesbão Veloso\", \"Eliseu Martins\",\r\n" + 
			"					\"Esperantina\", \"Fartura do Piauí\", \"Flores do Piauí\",\r\n" + 
			"					\"Floresta do Piauí\", \"Floriano\", \"Francinópolis\",\r\n" + 
			"					\"Francisco Ayres\", \"Francisco Macedo\", \"Francisco Santos\",\r\n" + 
			"					\"Fronteiras\", \"Geminiano\", \"Gilbués\", \"Guadalupe\",\r\n" + 
			"					\"Guaribas\", \"Hugo Napoleão\", \"Ilha Grande\", \"Inhuma\",\r\n" + 
			"					\"Ipiranga do Piauí\", \"Isaías Coelho\", \"Itainópolis\",\r\n" + 
			"					\"Itaueira\", \"Jacobina do Piauí\", \"Jaicós\",\r\n" + 
			"					\"Jardim do Mulato\", \"Jatobá do Piauí\", \"Jerumenha\",\r\n" + 
			"					\"João Costa\", \"Joaquim Pires\", \"Joca Marques\",\r\n" + 
			"					\"José de Freitas\", \"Juazeiro do Piauí\", \"Júlio Borges\",\r\n" + 
			"					\"Jurema\", \"Lagoa Alegre\", \"Lagoa de São Francisco\",\r\n" + 
			"					\"Lagoa do Barro do Piauí\", \"Lagoa do Piauí\",\r\n" + 
			"					\"Lagoa do Sítio\", \"Lagoinha do Piauí\", \"Landri Sales\",\r\n" + 
			"					\"Luís Correia\", \"Luzilândia\", \"Madeiro\", \"Manoel Emídio\",\r\n" + 
			"					\"Marcolândia\", \"Marcos Parente\", \"Massapê do Piauí\",\r\n" + 
			"					\"Matias Olímpio\", \"Miguel Alves\", \"Miguel Leão\",\r\n" + 
			"					\"Milton Brandão\", \"Monsenhor Gil\", \"Monsenhor Hipólito\",\r\n" + 
			"					\"Monte Alegre do Piauí\", \"Morro Cabeça no Tempo\",\r\n" + 
			"					\"Morro do Chapéu do Piauí\", \"Murici dos Portelas\",\r\n" + 
			"					\"Nazaré do Piauí\", \"Nossa Senhora de Nazaré\",\r\n" + 
			"					\"Nossa Senhora dos Remédios\", \"Nova Santa Rita\",\r\n" + 
			"					\"Novo Oriente do Piauí\", \"Novo Santo Antônio\", \"Oeiras\",\r\n" + 
			"					\"Olho d'Água do Piauí\", \"Padre Marcos\", \"Paes Landim\",\r\n" + 
			"					\"Pajeú do Piauí\", \"Palmeira do Piauí\", \"Palmeirais\",\r\n" + 
			"					\"Paquetá\", \"Parnaguá\", \"Parnaíba\",\r\n" + 
			"					\"Passagem Franca do Piauí\", \"Patos do Piauí\",\r\n" + 
			"					\"Pau d'Arco do Piauí\", \"Paulistana\", \"Pavussu\", \"Pedro II\",\r\n" + 
			"					\"Pedro Laurentino\", \"Picos\", \"Pimenteiras\", \"Pio IX\",\r\n" + 
			"					\"Piracuruca\", \"Piripiri\", \"Porto\", \"Porto Alegre do Piauí\",\r\n" + 
			"					\"Prata do Piauí\", \"Queimada Nova\", \"Redenção do Gurguéia\",\r\n" + 
			"					\"Regeneração\", \"Riacho Frio\", \"Ribeira do Piauí\",\r\n" + 
			"					\"Ribeiro Gonçalves\", \"Rio Grande do Piauí\",\r\n" + 
			"					\"Santa Cruz do Piauí\", \"Santa Cruz dos Milagres\",\r\n" + 
			"					\"Santa Filomena\", \"Santa Luz\", \"Santa Rosa do Piauí\",\r\n" + 
			"					\"Santana do Piauí\", \"Santo Antônio de Lisboa\",\r\n" + 
			"					\"Santo Antônio dos Milagres\", \"Santo Inácio do Piauí\",\r\n" + 
			"					\"São Braz do Piauí\", \"São Félix do Piauí\",\r\n" + 
			"					\"São Francisco de Assis do Piauí\",\r\n" + 
			"					\"São Francisco do Piauí\", \"São Gonçalo do Gurguéia\",\r\n" + 
			"					\"São Gonçalo do Piauí\", \"São João da Canabrava\",\r\n" + 
			"					\"São João da Fronteira\", \"São João da Serra\",\r\n" + 
			"					\"São João da Varjota\", \"São João do Arraial\",\r\n" + 
			"					\"São João do Piauí\", \"São José do Divino\",\r\n" + 
			"					\"São José do Peixe\", \"São José do Piauí\", \"São Julião\",\r\n" + 
			"					\"São Lourenço do Piauí\", \"São Luis do Piauí\",\r\n" + 
			"					\"São Miguel da Baixa Grande\", \"São Miguel do Fidalgo\",\r\n" + 
			"					\"São Miguel do Tapuio\", \"São Pedro do Piauí\",\r\n" + 
			"					\"São Raimundo Nonato\", \"Sebastião Barros\",\r\n" + 
			"					\"Sebastião Leal\", \"Sigefredo Pacheco\", \"Simões\",\r\n" + 
			"					\"Simplício Mendes\", \"Socorro do Piauí\", \"Sussuapara\",\r\n" + 
			"					\"Tamboril do Piauí\", \"Tanque do Piauí\", \"Teresina\",\r\n" + 
			"					\"União\", \"Uruçuí\", \"Valença do Piauí\", \"Várzea Branca\",\r\n" + 
			"					\"Várzea Grande\", \"Vera Mendes\", \"Vila Nova do Piauí\",\r\n" + 
			"					\"Wall Ferraz\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"PR\",\r\n" + 
			"			\"nome\" : \"Paraná\",\r\n" + 
			"			\"cidades\" : [ \"Abatiá\", \"Adrianópolis\", \"Agudos do Sul\",\r\n" + 
			"					\"Almirante Tamandaré\", \"Altamira do Paraná\", \"Alto Paraná\",\r\n" + 
			"					\"Alto Piquiri\", \"Altônia\", \"Alvorada do Sul\", \"Amaporã\",\r\n" + 
			"					\"Ampére\", \"Anahy\", \"Andirá\", \"Ângulo\", \"Antonina\",\r\n" + 
			"					\"Antônio Olinto\", \"Apucarana\", \"Arapongas\", \"Arapoti\",\r\n" + 
			"					\"Arapuã\", \"Araruna\", \"Araucária\", \"Ariranha do Ivaí\",\r\n" + 
			"					\"Assaí\", \"Assis Chateaubriand\", \"Astorga\", \"Atalaia\",\r\n" + 
			"					\"Balsa Nova\", \"Bandeirantes\", \"Barbosa Ferraz\",\r\n" + 
			"					\"Barra do Jacaré\", \"Barracão\", \"Bela Vista da Caroba\",\r\n" + 
			"					\"Bela Vista do Paraíso\", \"Bituruna\", \"Boa Esperança\",\r\n" + 
			"					\"Boa Esperança do Iguaçu\", \"Boa Ventura de São Roque\",\r\n" + 
			"					\"Boa Vista da Aparecida\", \"Bocaiúva do Sul\",\r\n" + 
			"					\"Bom Jesus do Sul\", \"Bom Sucesso\", \"Bom Sucesso do Sul\",\r\n" + 
			"					\"Borrazópolis\", \"Braganey\", \"Brasilândia do Sul\",\r\n" + 
			"					\"Cafeara\", \"Cafelândia\", \"Cafezal do Sul\", \"Califórnia\",\r\n" + 
			"					\"Cambará\", \"Cambé\", \"Cambira\", \"Campina da Lagoa\",\r\n" + 
			"					\"Campina do Simão\", \"Campina Grande do Sul\",\r\n" + 
			"					\"Campo Bonito\", \"Campo do Tenente\", \"Campo Largo\",\r\n" + 
			"					\"Campo Magro\", \"Campo Mourão\", \"Cândido de Abreu\",\r\n" + 
			"					\"Candói\", \"Cantagalo\", \"Capanema\",\r\n" + 
			"					\"Capitão Leônidas Marques\", \"Carambeí\", \"Carlópolis\",\r\n" + 
			"					\"Cascavel\", \"Castro\", \"Catanduvas\", \"Centenário do Sul\",\r\n" + 
			"					\"Cerro Azul\", \"Céu Azul\", \"Chopinzinho\", \"Cianorte\",\r\n" + 
			"					\"Cidade Gaúcha\", \"Clevelândia\", \"Colombo\", \"Colorado\",\r\n" + 
			"					\"Congonhinhas\", \"Conselheiro Mairinck\", \"Contenda\",\r\n" + 
			"					\"Corbélia\", \"Cornélio Procópio\", \"Coronel Domingos Soares\",\r\n" + 
			"					\"Coronel Vivida\", \"Corumbataí do Sul\", \"Cruz Machado\",\r\n" + 
			"					\"Cruzeiro do Iguaçu\", \"Cruzeiro do Oeste\",\r\n" + 
			"					\"Cruzeiro do Sul\", \"Cruzmaltina\", \"Curitiba\", \"Curiúva\",\r\n" + 
			"					\"Diamante d'Oeste\", \"Diamante do Norte\", \"Diamante do Sul\",\r\n" + 
			"					\"Dois Vizinhos\", \"Douradina\", \"Doutor Camargo\",\r\n" + 
			"					\"Doutor Ulysses\", \"Enéas Marques\", \"Engenheiro Beltrão\",\r\n" + 
			"					\"Entre Rios do Oeste\", \"Esperança Nova\",\r\n" + 
			"					\"Espigão Alto do Iguaçu\", \"Farol\", \"Faxinal\",\r\n" + 
			"					\"Fazenda Rio Grande\", \"Fênix\", \"Fernandes Pinheiro\",\r\n" + 
			"					\"Figueira\", \"Flor da Serra do Sul\", \"Floraí\", \"Floresta\",\r\n" + 
			"					\"Florestópolis\", \"Flórida\", \"Formosa do Oeste\",\r\n" + 
			"					\"Foz do Iguaçu\", \"Foz do Jordão\", \"Francisco Alves\",\r\n" + 
			"					\"Francisco Beltrão\", \"General Carneiro\", \"Godoy Moreira\",\r\n" + 
			"					\"Goioerê\", \"Goioxim\", \"Grandes Rios\", \"Guaíra\", \"Guairaçá\",\r\n" + 
			"					\"Guamiranga\", \"Guapirama\", \"Guaporema\", \"Guaraci\",\r\n" + 
			"					\"Guaraniaçu\", \"Guarapuava\", \"Guaraqueçaba\", \"Guaratuba\",\r\n" + 
			"					\"Honório Serpa\", \"Ibaiti\", \"Ibema\", \"Ibiporã\", \"Icaraíma\",\r\n" + 
			"					\"Iguaraçu\", \"Iguatu\", \"Imbaú\", \"Imbituva\",\r\n" + 
			"					\"Inácio Martins\", \"Inajá\", \"Indianópolis\", \"Ipiranga\",\r\n" + 
			"					\"Iporã\", \"Iracema do Oeste\", \"Irati\", \"Iretama\",\r\n" + 
			"					\"Itaguajé\", \"Itaipulândia\", \"Itambaracá\", \"Itambé\",\r\n" + 
			"					\"Itapejara d'Oeste\", \"Itaperuçu\", \"Itaúna do Sul\", \"Ivaí\",\r\n" + 
			"					\"Ivaiporã\", \"Ivaté\", \"Ivatuba\", \"Jaboti\", \"Jacarezinho\",\r\n" + 
			"					\"Jaguapitã\", \"Jaguariaíva\", \"Jandaia do Sul\", \"Janiópolis\",\r\n" + 
			"					\"Japira\", \"Japurá\", \"Jardim Alegre\", \"Jardim Olinda\",\r\n" + 
			"					\"Jataizinho\", \"Jesuítas\", \"Joaquim Távora\",\r\n" + 
			"					\"Jundiaí do Sul\", \"Juranda\", \"Jussara\", \"Kaloré\", \"Lapa\",\r\n" + 
			"					\"Laranjal\", \"Laranjeiras do Sul\", \"Leópolis\",\r\n" + 
			"					\"Lidianópolis\", \"Lindoeste\", \"Loanda\", \"Lobato\",\r\n" + 
			"					\"Londrina\", \"Luiziana\", \"Lunardelli\", \"Lupionópolis\",\r\n" + 
			"					\"Mallet\", \"Mamborê\", \"Mandaguaçu\", \"Mandaguari\",\r\n" + 
			"					\"Mandirituba\", \"Manfrinópolis\", \"Mangueirinha\",\r\n" + 
			"					\"Manoel Ribas\", \"Marechal Cândido Rondon\", \"Maria Helena\",\r\n" + 
			"					\"Marialva\", \"Marilândia do Sul\", \"Marilena\", \"Mariluz\",\r\n" + 
			"					\"Maringá\", \"Mariópolis\", \"Maripá\", \"Marmeleiro\",\r\n" + 
			"					\"Marquinho\", \"Marumbi\", \"Matelândia\", \"Matinhos\",\r\n" + 
			"					\"Mato Rico\", \"Mauá da Serra\", \"Medianeira\", \"Mercedes\",\r\n" + 
			"					\"Mirador\", \"Miraselva\", \"Missal\", \"Moreira Sales\",\r\n" + 
			"					\"Morretes\", \"Munhoz de Melo\", \"Nossa Senhora das Graças\",\r\n" + 
			"					\"Nova Aliança do Ivaí\", \"Nova América da Colina\",\r\n" + 
			"					\"Nova Aurora\", \"Nova Cantu\", \"Nova Esperança\",\r\n" + 
			"					\"Nova Esperança do Sudoeste\", \"Nova Fátima\",\r\n" + 
			"					\"Nova Laranjeiras\", \"Nova Londrina\", \"Nova Olímpia\",\r\n" + 
			"					\"Nova Prata do Iguaçu\", \"Nova Santa Bárbara\",\r\n" + 
			"					\"Nova Santa Rosa\", \"Nova Tebas\", \"Novo Itacolomi\",\r\n" + 
			"					\"Ortigueira\", \"Ourizona\", \"Ouro Verde do Oeste\",\r\n" + 
			"					\"Paiçandu\", \"Palmas\", \"Palmeira\", \"Palmital\", \"Palotina\",\r\n" + 
			"					\"Paraíso do Norte\", \"Paranacity\", \"Paranaguá\",\r\n" + 
			"					\"Paranapoema\", \"Paranavaí\", \"Pato Bragado\", \"Pato Branco\",\r\n" + 
			"					\"Paula Freitas\", \"Paulo Frontin\", \"Peabiru\", \"Perobal\",\r\n" + 
			"					\"Pérola\", \"Pérola d'Oeste\", \"Piên\", \"Pinhais\",\r\n" + 
			"					\"Pinhal de São Bento\", \"Pinhalão\", \"Pinhão\",\r\n" + 
			"					\"Piraí do Sul\", \"Piraquara\", \"Pitanga\", \"Pitangueiras\",\r\n" + 
			"					\"Planaltina do Paraná\", \"Planalto\", \"Ponta Grossa\",\r\n" + 
			"					\"Pontal do Paraná\", \"Porecatu\", \"Porto Amazonas\",\r\n" + 
			"					\"Porto Barreiro\", \"Porto Rico\", \"Porto Vitória\",\r\n" + 
			"					\"Prado Ferreira\", \"Pranchita\", \"Presidente Castelo Branco\",\r\n" + 
			"					\"Primeiro de Maio\", \"Prudentópolis\", \"Quarto Centenário\",\r\n" + 
			"					\"Quatiguá\", \"Quatro Barras\", \"Quatro Pontes\",\r\n" + 
			"					\"Quedas do Iguaçu\", \"Querência do Norte\", \"Quinta do Sol\",\r\n" + 
			"					\"Quitandinha\", \"Ramilândia\", \"Rancho Alegre\",\r\n" + 
			"					\"Rancho Alegre d'Oeste\", \"Realeza\", \"Rebouças\",\r\n" + 
			"					\"Renascença\", \"Reserva\", \"Reserva do Iguaçu\",\r\n" + 
			"					\"Ribeirão Claro\", \"Ribeirão do Pinhal\", \"Rio Azul\",\r\n" + 
			"					\"Rio Bom\", \"Rio Bonito do Iguaçu\", \"Rio Branco do Ivaí\",\r\n" + 
			"					\"Rio Branco do Sul\", \"Rio Negro\", \"Rolândia\", \"Roncador\",\r\n" + 
			"					\"Rondon\", \"Rosário do Ivaí\", \"Sabáudia\", \"Salgado Filho\",\r\n" + 
			"					\"Salto do Itararé\", \"Salto do Lontra\", \"Santa Amélia\",\r\n" + 
			"					\"Santa Cecília do Pavão\", \"Santa Cruz Monte Castelo\",\r\n" + 
			"					\"Santa Fé\", \"Santa Helena\", \"Santa Inês\",\r\n" + 
			"					\"Santa Isabel do Ivaí\", \"Santa Izabel do Oeste\",\r\n" + 
			"					\"Santa Lúcia\", \"Santa Maria do Oeste\", \"Santa Mariana\",\r\n" + 
			"					\"Santa Mônica\", \"Santa Tereza do Oeste\",\r\n" + 
			"					\"Santa Terezinha de Itaipu\", \"Santana do Itararé\",\r\n" + 
			"					\"Santo Antônio da Platina\", \"Santo Antônio do Caiuá\",\r\n" + 
			"					\"Santo Antônio do Paraíso\", \"Santo Antônio do Sudoeste\",\r\n" + 
			"					\"Santo Inácio\", \"São Carlos do Ivaí\",\r\n" + 
			"					\"São Jerônimo da Serra\", \"São João\", \"São João do Caiuá\",\r\n" + 
			"					\"São João do Ivaí\", \"São João do Triunfo\",\r\n" + 
			"					\"São Jorge d'Oeste\", \"São Jorge do Ivaí\",\r\n" + 
			"					\"São Jorge do Patrocínio\", \"São José da Boa Vista\",\r\n" + 
			"					\"São José das Palmeiras\", \"São José dos Pinhais\",\r\n" + 
			"					\"São Manoel do Paraná\", \"São Mateus do Sul\",\r\n" + 
			"					\"São Miguel do Iguaçu\", \"São Pedro do Iguaçu\",\r\n" + 
			"					\"São Pedro do Ivaí\", \"São Pedro do Paraná\",\r\n" + 
			"					\"São Sebastião da Amoreira\", \"São Tomé\", \"Sapopema\",\r\n" + 
			"					\"Sarandi\", \"Saudade do Iguaçu\", \"Sengés\",\r\n" + 
			"					\"Serranópolis do Iguaçu\", \"Sertaneja\", \"Sertanópolis\",\r\n" + 
			"					\"Siqueira Campos\", \"Sulina\", \"Tamarana\", \"Tamboara\",\r\n" + 
			"					\"Tapejara\", \"Tapira\", \"Teixeira Soares\", \"Telêmaco Borba\",\r\n" + 
			"					\"Terra Boa\", \"Terra Rica\", \"Terra Roxa\", \"Tibagi\",\r\n" + 
			"					\"Tijucas do Sul\", \"Toledo\", \"Tomazina\",\r\n" + 
			"					\"Três Barras do Paraná\", \"Tunas do Paraná\",\r\n" + 
			"					\"Tuneiras do Oeste\", \"Tupãssi\", \"Turvo\", \"Ubiratã\",\r\n" + 
			"					\"Umuarama\", \"União da Vitória\", \"Uniflor\", \"Uraí\",\r\n" + 
			"					\"Ventania\", \"Vera Cruz do Oeste\", \"Verê\", \"Vila Alta\",\r\n" + 
			"					\"Virmond\", \"Vitorino\", \"Wenceslau Braz\", \"Xambrê\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"RJ\",\r\n" + 
			"			\"nome\" : \"Rio de Janeiro\",\r\n" + 
			"			\"cidades\" : [ \"Angra dos Reis\", \"Aperibé\", \"Araruama\", \"Areal\",\r\n" + 
			"					\"Armação de Búzios\", \"Arraial do Cabo\", \"Barra do Piraí\",\r\n" + 
			"					\"Barra Mansa\", \"Belford Roxo\", \"Bom Jardim\",\r\n" + 
			"					\"Bom Jesus do Itabapoana\", \"Cabo Frio\",\r\n" + 
			"					\"Cachoeiras de Macacu\", \"Cambuci\", \"Campos dos Goytacazes\",\r\n" + 
			"					\"Cantagalo\", \"Carapebus\", \"Cardoso Moreira\", \"Carmo\",\r\n" + 
			"					\"Casimiro de Abreu\", \"Comendador Levy Gasparian\",\r\n" + 
			"					\"Conceição de Macabu\", \"Cordeiro\", \"Duas Barras\",\r\n" + 
			"					\"Duque de Caxias\", \"Engenheiro Paulo de Frontin\",\r\n" + 
			"					\"Guapimirim\", \"Iguaba Grande\", \"Itaboraí\", \"Itaguaí\",\r\n" + 
			"					\"Italva\", \"Itaocara\", \"Itaperuna\", \"Itatiaia\", \"Japeri\",\r\n" + 
			"					\"Laje do Muriaé\", \"Macaé\", \"Macuco\", \"Magé\", \"Mangaratiba\",\r\n" + 
			"					\"Maricá\", \"Mendes\", \"Mesquita\", \"Miguel Pereira\",\r\n" + 
			"					\"Miracema\", \"Natividade\", \"Nilópolis\", \"Niterói\",\r\n" + 
			"					\"Nova Friburgo\", \"Nova Iguaçu\", \"Paracambi\",\r\n" + 
			"					\"Paraíba do Sul\", \"Parati\", \"Paty do Alferes\",\r\n" + 
			"					\"Petrópolis\", \"Pinheiral\", \"Piraí\", \"Porciúncula\",\r\n" + 
			"					\"Porto Real\", \"Quatis\", \"Queimados\", \"Quissamã\", \"Resende\",\r\n" + 
			"					\"Rio Bonito\", \"Rio Claro\", \"Rio das Flores\",\r\n" + 
			"					\"Rio das Ostras\", \"Rio de Janeiro\", \"Santa Maria Madalena\",\r\n" + 
			"					\"Santo Antônio de Pádua\", \"São Fidélis\",\r\n" + 
			"					\"São Francisco de Itabapoana\", \"São Gonçalo\",\r\n" + 
			"					\"São João da Barra\", \"São João de Meriti\",\r\n" + 
			"					\"São José de Ubá\", \"São José do Vale do Rio Preto\",\r\n" + 
			"					\"São Pedro da Aldeia\", \"São Sebastião do Alto\", \"Sapucaia\",\r\n" + 
			"					\"Saquarema\", \"Seropédica\", \"Silva Jardim\", \"Sumidouro\",\r\n" + 
			"					\"Tanguá\", \"Teresópolis\", \"Trajano de Morais\", \"Três Rios\",\r\n" + 
			"					\"Valença\", \"Varre-Sai\", \"Vassouras\", \"Volta Redonda\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"RN\",\r\n" + 
			"			\"nome\" : \"Rio Grande do Norte\",\r\n" + 
			"			\"cidades\" : [ \"Acari\", \"Açu\", \"Afonso Bezerra\", \"Água Nova\",\r\n" + 
			"					\"Alexandria\", \"Almino Afonso\", \"Alto do Rodrigues\",\r\n" + 
			"					\"Angicos\", \"Antônio Martins\", \"Apodi\", \"Areia Branca\",\r\n" + 
			"					\"Arês\", \"Augusto Severo\", \"Baía Formosa\", \"Baraúna\",\r\n" + 
			"					\"Barcelona\", \"Bento Fernandes\", \"Bodó\", \"Bom Jesus\",\r\n" + 
			"					\"Brejinho\", \"Caiçara do Norte\", \"Caiçara do Rio do Vento\",\r\n" + 
			"					\"Caicó\", \"Campo Redondo\", \"Canguaretama\", \"Caraúbas\",\r\n" + 
			"					\"Carnaúba dos Dantas\", \"Carnaubais\", \"Ceará-Mirim\",\r\n" + 
			"					\"Cerro Corá\", \"Coronel Ezequiel\", \"Coronel João Pessoa\",\r\n" + 
			"					\"Cruzeta\", \"Currais Novos\", \"Doutor Severiano\", \"Encanto\",\r\n" + 
			"					\"Equador\", \"Espírito Santo\", \"Extremoz\", \"Felipe Guerra\",\r\n" + 
			"					\"Fernando Pedroza\", \"Florânia\", \"Francisco Dantas\",\r\n" + 
			"					\"Frutuoso Gomes\", \"Galinhos\", \"Goianinha\",\r\n" + 
			"					\"Governador Dix-Sept Rosado\", \"Grossos\", \"Guamaré\",\r\n" + 
			"					\"Ielmo Marinho\", \"Ipanguaçu\", \"Ipueira\", \"Itajá\", \"Itaú\",\r\n" + 
			"					\"Jaçanã\", \"Jandaíra\", \"Janduís\", \"Januário Cicco\", \"Japi\",\r\n" + 
			"					\"Jardim de Angicos\", \"Jardim de Piranhas\",\r\n" + 
			"					\"Jardim do Seridó\", \"João Câmara\", \"João Dias\",\r\n" + 
			"					\"José da Penha\", \"Jucurutu\", \"Jundiá\", \"Lagoa d'Anta\",\r\n" + 
			"					\"Lagoa de Pedras\", \"Lagoa de Velhos\", \"Lagoa Nova\",\r\n" + 
			"					\"Lagoa Salgada\", \"Lajes\", \"Lajes Pintadas\", \"Lucrécia\",\r\n" + 
			"					\"Luís Gomes\", \"Macaíba\", \"Macau\", \"Major Sales\",\r\n" + 
			"					\"Marcelino Vieira\", \"Martins\", \"Maxaranguape\",\r\n" + 
			"					\"Messias Targino\", \"Montanhas\", \"Monte Alegre\",\r\n" + 
			"					\"Monte das Gameleiras\", \"Mossoró\", \"Natal\",\r\n" + 
			"					\"Nísia Floresta\", \"Nova Cruz\", \"Olho-d'Água do Borges\",\r\n" + 
			"					\"Ouro Branco\", \"Paraná\", \"Paraú\", \"Parazinho\", \"Parelhas\",\r\n" + 
			"					\"Parnamirim\", \"Passa e Fica\", \"Passagem\", \"Patu\",\r\n" + 
			"					\"Pau dos Ferros\", \"Pedra Grande\", \"Pedra Preta\",\r\n" + 
			"					\"Pedro Avelino\", \"Pedro Velho\", \"Pendências\", \"Pilões\",\r\n" + 
			"					\"Poço Branco\", \"Portalegre\", \"Porto do Mangue\",\r\n" + 
			"					\"Presidente Juscelino\", \"Pureza\", \"Rafael Fernandes\",\r\n" + 
			"					\"Rafael Godeiro\", \"Riacho da Cruz\", \"Riacho de Santana\",\r\n" + 
			"					\"Riachuelo\", \"Rio do Fogo\", \"Rodolfo Fernandes\",\r\n" + 
			"					\"Ruy Barbosa\", \"Santa Cruz\", \"Santa Maria\",\r\n" + 
			"					\"Santana do Matos\", \"Santana do Seridó\", \"Santo Antônio\",\r\n" + 
			"					\"São Bento do Norte\", \"São Bento do Trairí\",\r\n" + 
			"					\"São Fernando\", \"São Francisco do Oeste\",\r\n" + 
			"					\"São Gonçalo do Amarante\", \"São João do Sabugi\",\r\n" + 
			"					\"São José de Mipibu\", \"São José do Campestre\",\r\n" + 
			"					\"São José do Seridó\", \"São Miguel\", \"São Miguel de Touros\",\r\n" + 
			"					\"São Paulo do Potengi\", \"São Pedro\", \"São Rafael\",\r\n" + 
			"					\"São Tomé\", \"São Vicente\", \"Senador Elói de Souza\",\r\n" + 
			"					\"Senador Georgino Avelino\", \"Serra de São Bento\",\r\n" + 
			"					\"Serra do Mel\", \"Serra Negra do Norte\", \"Serrinha\",\r\n" + 
			"					\"Serrinha dos Pintos\", \"Severiano Melo\", \"Sítio Novo\",\r\n" + 
			"					\"Taboleiro Grande\", \"Taipu\", \"Tangará\", \"Tenente Ananias\",\r\n" + 
			"					\"Tenente Laurentino Cruz\", \"Tibau\", \"Tibau do Sul\",\r\n" + 
			"					\"Timbaúba dos Batistas\", \"Touros\", \"Triunfo Potiguar\",\r\n" + 
			"					\"Umarizal\", \"Upanema\", \"Várzea\", \"Venha-Ver\", \"Vera Cruz\",\r\n" + 
			"					\"Viçosa\", \"Vila Flor\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"RO\",\r\n" + 
			"			\"nome\" : \"Rondônia\",\r\n" + 
			"			\"cidades\" : [ \"Alta Floresta d'Oeste\", \"Alto Alegre do Parecis\",\r\n" + 
			"					\"Alto Paraíso\", \"Alvorada d'Oeste\", \"Ariquemes\", \"Buritis\",\r\n" + 
			"					\"Cabixi\", \"Cacaulândia\", \"Cacoal\",\r\n" + 
			"					\"Campo Novo de Rondônia\", \"Candeias do Jamari\",\r\n" + 
			"					\"Castanheiras\", \"Cerejeiras\", \"Chupinguaia\",\r\n" + 
			"					\"Colorado do Oeste\", \"Corumbiara\", \"Costa Marques\",\r\n" + 
			"					\"Cujubim\", \"Espigão d'Oeste\", \"Governador Jorge Teixeira\",\r\n" + 
			"					\"Guajará-Mirim\", \"Itapuã do Oeste\", \"Jaru\", \"Ji-Paraná\",\r\n" + 
			"					\"Machadinho d'Oeste\", \"Ministro Andreazza\",\r\n" + 
			"					\"Mirante da Serra\", \"Monte Negro\",\r\n" + 
			"					\"Nova Brasilândia d'Oeste\", \"Nova Mamoré\", \"Nova União\",\r\n" + 
			"					\"Novo Horizonte do Oeste\", \"Ouro Preto do Oeste\",\r\n" + 
			"					\"Parecis\", \"Pimenta Bueno\", \"Pimenteiras do Oeste\",\r\n" + 
			"					\"Porto Velho\", \"Presidente Médici\",\r\n" + 
			"					\"Primavera de Rondônia\", \"Rio Crespo\", \"Rolim de Moura\",\r\n" + 
			"					\"Santa Luzia d'Oeste\", \"São Felipe d'Oeste\",\r\n" + 
			"					\"São Francisco do Guaporé\", \"São Miguel do Guaporé\",\r\n" + 
			"					\"Seringueiras\", \"Teixeirópolis\", \"Theobroma\", \"Urupá\",\r\n" + 
			"					\"Vale do Anari\", \"Vale do Paraíso\", \"Vilhena\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"RR\",\r\n" + 
			"			\"nome\" : \"Roraima\",\r\n" + 
			"			\"cidades\" : [ \"Alto Alegre\", \"Amajari\", \"Boa Vista\", \"Bonfim\",\r\n" + 
			"					\"Cantá\", \"Caracaraí\", \"Caroebe\", \"Iracema\", \"Mucajaí\",\r\n" + 
			"					\"Normandia\", \"Pacaraima\", \"Rorainópolis\",\r\n" + 
			"					\"São João da Baliza\", \"São Luiz\", \"Uiramutã\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"RS\",\r\n" + 
			"			\"nome\" : \"Rio Grande do Sul\",\r\n" + 
			"			\"cidades\" : [ \"Aceguá\", \"Água Santa\", \"Agudo\", \"Ajuricaba\",\r\n" + 
			"					\"Alecrim\", \"Alegrete\", \"Alegria\",\r\n" + 
			"					\"Almirante Tamandaré do Sul\", \"Alpestre\", \"Alto Alegre\",\r\n" + 
			"					\"Alto Feliz\", \"Alvorada\", \"Amaral Ferrador\",\r\n" + 
			"					\"Ametista do Sul\", \"André da Rocha\", \"Anta Gorda\",\r\n" + 
			"					\"Antônio Prado\", \"Arambaré\", \"Araricá\", \"Aratiba\",\r\n" + 
			"					\"Arroio do Meio\", \"Arroio do Padre\", \"Arroio do Sal\",\r\n" + 
			"					\"Arroio do Tigre\", \"Arroio dos Ratos\", \"Arroio Grande\",\r\n" + 
			"					\"Arvorezinha\", \"Augusto Pestana\", \"Áurea\", \"Bagé\",\r\n" + 
			"					\"Balneário Pinhal\", \"Barão\", \"Barão de Cotegipe\",\r\n" + 
			"					\"Barão do Triunfo\", \"Barra do Guarita\", \"Barra do Quaraí\",\r\n" + 
			"					\"Barra do Ribeiro\", \"Barra do Rio Azul\", \"Barra Funda\",\r\n" + 
			"					\"Barracão\", \"Barros Cassal\", \"Benjamin Constan do Sul\",\r\n" + 
			"					\"Bento Gonçalves\", \"Boa Vista das Missões\",\r\n" + 
			"					\"Boa Vista do Buricá\", \"Boa Vista do Cadeado\",\r\n" + 
			"					\"Boa Vista do Incra\", \"Boa Vista do Sul\", \"Bom Jesus\",\r\n" + 
			"					\"Bom Princípio\", \"Bom Progresso\", \"Bom Retiro do Sul\",\r\n" + 
			"					\"Boqueirão do Leão\", \"Bossoroca\", \"Bozano\", \"Braga\",\r\n" + 
			"					\"Brochier\", \"Butiá\", \"Caçapava do Sul\", \"Cacequi\",\r\n" + 
			"					\"Cachoeira do Sul\", \"Cachoeirinha\", \"Cacique Doble\",\r\n" + 
			"					\"Caibaté\", \"Caiçara\", \"Camaquã\", \"Camargo\",\r\n" + 
			"					\"Cambará do Sul\", \"Campestre da Serra\",\r\n" + 
			"					\"Campina das Missões\", \"Campinas do Sul\", \"Campo Bom\",\r\n" + 
			"					\"Campo Novo\", \"Campos Borges\", \"Candelária\",\r\n" + 
			"					\"Cândido Godói\", \"Candiota\", \"Canela\", \"Canguçu\", \"Canoas\",\r\n" + 
			"					\"Canudos do Vale\", \"Capão Bonito do Sul\", \"Capão da Canoa\",\r\n" + 
			"					\"Capão do Cipó\", \"Capão do Leão\", \"Capela de Santana\",\r\n" + 
			"					\"Capitão\", \"Capivari do Sul\", \"Caraá\", \"Carazinho\",\r\n" + 
			"					\"Carlos Barbosa\", \"Carlos Gomes\", \"Casca\", \"Caseiros\",\r\n" + 
			"					\"Catuípe\", \"Caxias do Sul\", \"Centenário\", \"Cerrito\",\r\n" + 
			"					\"Cerro Branco\", \"Cerro Grande\", \"Cerro Grande do Sul\",\r\n" + 
			"					\"Cerro Largo\", \"Chapada\", \"Charqueadas\", \"Charrua\",\r\n" + 
			"					\"Chiapeta\", \"Chuí\", \"Chuvisca\", \"Cidreira\", \"Ciríaco\",\r\n" + 
			"					\"Colinas\", \"Colorado\", \"Condor\", \"Constantina\",\r\n" + 
			"					\"Coqueiro Baixo\", \"Coqueiros do Sul\", \"Coronel Barros\",\r\n" + 
			"					\"Coronel Bicaco\", \"Coronel Pilar\", \"Cotiporã\", \"Coxilha\",\r\n" + 
			"					\"Crissiumal\", \"Cristal\", \"Cristal do Sul\", \"Cruz Alta\",\r\n" + 
			"					\"Cruzaltense\", \"Cruzeiro do Sul\", \"David Canabarro\",\r\n" + 
			"					\"Derrubadas\", \"Dezesseis de Novembro\",\r\n" + 
			"					\"Dilermando de Aguiar\", \"Dois Irmãos\",\r\n" + 
			"					\"Dois Irmãos das Missões\", \"Dois Lajeados\",\r\n" + 
			"					\"Dom Feliciano\", \"Dom Pedrito\", \"Dom Pedro de Alcântara\",\r\n" + 
			"					\"Dona Francisca\", \"Doutor Maurício Cardoso\",\r\n" + 
			"					\"Doutor Ricardo\", \"Eldorado do Sul\", \"Encantado\",\r\n" + 
			"					\"Encruzilhada do Sul\", \"Engenho Velho\",\r\n" + 
			"					\"Entre Rios do Sul\", \"Entre-Ijuís\", \"Erebango\", \"Erechim\",\r\n" + 
			"					\"Ernestina\", \"Erval Grande\", \"Erval Seco\", \"Esmeralda\",\r\n" + 
			"					\"Esperança do Sul\", \"Espumoso\", \"Estação\",\r\n" + 
			"					\"Estância Velha\", \"Esteio\", \"Estrela\", \"Estrela Velha\",\r\n" + 
			"					\"Eugênio de Castro\", \"Fagundes Varela\", \"Farroupilha\",\r\n" + 
			"					\"Faxinal do Soturno\", \"Faxinalzinho\", \"Fazenda Vilanova\",\r\n" + 
			"					\"Feliz\", \"Flores da Cunha\", \"Floriano Peixoto\",\r\n" + 
			"					\"Fontoura Xavier\", \"Formigueiro\", \"Forquetinha\",\r\n" + 
			"					\"Fortaleza dos Valos\", \"Frederico Westphalen\", \"Garibaldi\",\r\n" + 
			"					\"Garruchos\", \"Gaurama\", \"General Câmara\", \"Gentil\",\r\n" + 
			"					\"Getúlio Vargas\", \"Giruá\", \"Glorinha\", \"Gramado\",\r\n" + 
			"					\"Gramado dos Loureiros\", \"Gramado Xavier\", \"Gravataí\",\r\n" + 
			"					\"Guabiju\", \"Guaíba\", \"Guaporé\", \"Guarani das Missões\",\r\n" + 
			"					\"Harmonia\", \"Herval\", \"Herveiras\", \"Horizontina\",\r\n" + 
			"					\"Hulha Negra\", \"Humaitá\", \"Ibarama\", \"Ibiaçá\",\r\n" + 
			"					\"Ibiraiaras\", \"Ibirapuitã\", \"Ibirubá\", \"Igrejinha\", \"Ijuí\",\r\n" + 
			"					\"Ilópolis\", \"Imbé\", \"Imigrante\", \"Independência\",\r\n" + 
			"					\"Inhacorá\", \"Ipê\", \"Ipiranga do Sul\", \"Iraí\", \"Itaara\",\r\n" + 
			"					\"Itacurubi\", \"Itapuca\", \"Itaqui\", \"Itati\",\r\n" + 
			"					\"Itatiba do Sul\", \"Ivorá\", \"Ivoti\", \"Jaboticaba\",\r\n" + 
			"					\"Jacuizinho\", \"Jacutinga\", \"Jaguarão\", \"Jaguari\",\r\n" + 
			"					\"Jaquirana\", \"Jari\", \"Jóia\", \"Júlio de Castilhos\",\r\n" + 
			"					\"Lagoa Bonita do Sul\", \"Lagoa dos Três Cantos\",\r\n" + 
			"					\"Lagoa Vermelha\", \"Lagoão\", \"Lajeado\", \"Lajeado do Bugre\",\r\n" + 
			"					\"Lavras do Sul\", \"Liberato Salzano\", \"Lindolfo Collor\",\r\n" + 
			"					\"Linha Nova\", \"Maçambara\", \"Machadinho\", \"Mampituba\",\r\n" + 
			"					\"Manoel Viana\", \"Maquiné\", \"Maratá\", \"Marau\",\r\n" + 
			"					\"Marcelino Ramos\", \"Mariana Pimentel\", \"Mariano Moro\",\r\n" + 
			"					\"Marques de Souza\", \"Mata\", \"Mato Castelhano\",\r\n" + 
			"					\"Mato Leitão\", \"Mato Queimado\", \"Maximiliano de Almeida\",\r\n" + 
			"					\"Minas do Leão\", \"Miraguaí\", \"Montauri\",\r\n" + 
			"					\"Monte Alegre dos Campos\", \"Monte Belo do Sul\",\r\n" + 
			"					\"Montenegro\", \"Mormaço\", \"Morrinhos do Sul\",\r\n" + 
			"					\"Morro Redondo\", \"Morro Reuter\", \"Mostardas\", \"Muçum\",\r\n" + 
			"					\"Muitos Capões\", \"Muliterno\", \"Não-Me-Toque\",\r\n" + 
			"					\"Nicolau Vergueiro\", \"Nonoai\", \"Nova Alvorada\",\r\n" + 
			"					\"Nova Araçá\", \"Nova Bassano\", \"Nova Boa Vista\",\r\n" + 
			"					\"Nova Bréscia\", \"Nova Candelária\", \"Nova Esperança do Sul\",\r\n" + 
			"					\"Nova Hartz\", \"Nova Pádua\", \"Nova Palma\",\r\n" + 
			"					\"Nova Petrópolis\", \"Nova Prata\", \"Nova Ramada\",\r\n" + 
			"					\"Nova Roma do Sul\", \"Nova Santa Rita\", \"Novo Barreiro\",\r\n" + 
			"					\"Novo Cabrais\", \"Novo Hamburgo\", \"Novo Machado\",\r\n" + 
			"					\"Novo Tiradentes\", \"Novo Xingu\", \"Osório\", \"Paim Filho\",\r\n" + 
			"					\"Palmares do Sul\", \"Palmeira das Missões\", \"Palmitinho\",\r\n" + 
			"					\"Panambi\", \"Pântano Grande\", \"Paraí\", \"Paraíso do Sul\",\r\n" + 
			"					\"Pareci Novo\", \"Parobé\", \"Passa Sete\", \"Passo do Sobrado\",\r\n" + 
			"					\"Passo Fundo\", \"Paulo Bento\", \"Paverama\", \"Pedras Altas\",\r\n" + 
			"					\"Pedro Osório\", \"Pejuçara\", \"Pelotas\", \"Picada Café\",\r\n" + 
			"					\"Pinhal\", \"Pinhal da Serra\", \"Pinhal Grande\",\r\n" + 
			"					\"Pinheirinho do Vale\", \"Pinheiro Machado\", \"Pirapó\",\r\n" + 
			"					\"Piratini\", \"Planalto\", \"Poço das Antas\", \"Pontão\",\r\n" + 
			"					\"Ponte Preta\", \"Portão\", \"Porto Alegre\", \"Porto Lucena\",\r\n" + 
			"					\"Porto Mauá\", \"Porto Vera Cruz\", \"Porto Xavier\",\r\n" + 
			"					\"Pouso Novo\", \"Presidente Lucena\", \"Progresso\",\r\n" + 
			"					\"Protásio Alves\", \"Putinga\", \"Quaraí\", \"Quatro Irmãos\",\r\n" + 
			"					\"Quevedos\", \"Quinze de Novembro\", \"Redentora\", \"Relvado\",\r\n" + 
			"					\"Restinga Seca\", \"Rio dos Índios\", \"Rio Grande\",\r\n" + 
			"					\"Rio Pardo\", \"Riozinho\", \"Roca Sales\", \"Rodeio Bonito\",\r\n" + 
			"					\"Rolador\", \"Rolante\", \"Ronda Alta\", \"Rondinha\",\r\n" + 
			"					\"Roque Gonzales\", \"Rosário do Sul\", \"Sagrada Família\",\r\n" + 
			"					\"Saldanha Marinho\", \"Salto do Jacuí\",\r\n" + 
			"					\"Salvador das Missões\", \"Salvador do Sul\", \"Sananduva\",\r\n" + 
			"					\"Santa Bárbara do Sul\", \"Santa Cecília do Sul\",\r\n" + 
			"					\"Santa Clara do Sul\", \"Santa Cruz do Sul\",\r\n" + 
			"					\"Santa Margarida do Sul\", \"Santa Maria\",\r\n" + 
			"					\"Santa Maria do Herval\", \"Santa Rosa\", \"Santa Tereza\",\r\n" + 
			"					\"Santa Vitória do Palmar\", \"Santana da Boa Vista\",\r\n" + 
			"					\"Santana do Livramento\", \"Santiago\", \"Santo Ângelo\",\r\n" + 
			"					\"Santo Antônio da Patrulha\", \"Santo Antônio das Missões\",\r\n" + 
			"					\"Santo Antônio do Palma\", \"Santo Antônio do Planalto\",\r\n" + 
			"					\"Santo Augusto\", \"Santo Cristo\", \"Santo Expedito do Sul\",\r\n" + 
			"					\"São Borja\", \"São Domingos do Sul\",\r\n" + 
			"					\"São Francisco de Assis\", \"São Francisco de Paula\",\r\n" + 
			"					\"São Gabriel\", \"São Jerônimo\", \"São João da Urtiga\",\r\n" + 
			"					\"São João do Polêsine\", \"São Jorge\",\r\n" + 
			"					\"São José das Missões\", \"São José do Herval\",\r\n" + 
			"					\"São José do Hortêncio\", \"São José do Inhacorá\",\r\n" + 
			"					\"São José do Norte\", \"São José do Ouro\", \"São José do Sul\",\r\n" + 
			"					\"São José dos Ausentes\", \"São Leopoldo\",\r\n" + 
			"					\"São Lourenço do Sul\", \"São Luiz Gonzaga\", \"São Marcos\",\r\n" + 
			"					\"São Martinho\", \"São Martinho da Serra\",\r\n" + 
			"					\"São Miguel das Missões\", \"São Nicolau\",\r\n" + 
			"					\"São Paulo das Missões\", \"São Pedro da Serra\",\r\n" + 
			"					\"São Pedro das Missões\", \"São Pedro do Butiá\",\r\n" + 
			"					\"São Pedro do Sul\", \"São Sebastião do Caí\", \"São Sepé\",\r\n" + 
			"					\"São Valentim\", \"São Valentim do Sul\",\r\n" + 
			"					\"São Valério do Sul\", \"São Vendelino\",\r\n" + 
			"					\"São Vicente do Sul\", \"Sapiranga\", \"Sapucaia do Sul\",\r\n" + 
			"					\"Sarandi\", \"Seberi\", \"Sede Nova\", \"Segredo\", \"Selbach\",\r\n" + 
			"					\"Senador Salgado Filho\", \"Sentinela do Sul\",\r\n" + 
			"					\"Serafina Corrêa\", \"Sério\", \"Sertão\", \"Sertão Santana\",\r\n" + 
			"					\"Sete de Setembro\", \"Severiano de Almeida\",\r\n" + 
			"					\"Silveira Martins\", \"Sinimbu\", \"Sobradinho\", \"Soledade\",\r\n" + 
			"					\"Tabaí\", \"Tapejara\", \"Tapera\", \"Tapes\", \"Taquara\",\r\n" + 
			"					\"Taquari\", \"Taquaruçu do Sul\", \"Tavares\",\r\n" + 
			"					\"Tenente Portela\", \"Terra de Areia\", \"Teutônia\",\r\n" + 
			"					\"Tio Hugo\", \"Tiradentes do Sul\", \"Toropi\", \"Torres\",\r\n" + 
			"					\"Tramandaí\", \"Travesseiro\", \"Três Arroios\",\r\n" + 
			"					\"Três Cachoeiras\", \"Três Coroas\", \"Três de Maio\",\r\n" + 
			"					\"Três Forquilhas\", \"Três Palmeiras\", \"Três Passos\",\r\n" + 
			"					\"Trindade do Sul\", \"Triunfo\", \"Tucunduva\", \"Tunas\",\r\n" + 
			"					\"Tupanci do Sul\", \"Tupanciretã\", \"Tupandi\", \"Tuparendi\",\r\n" + 
			"					\"Turuçu\", \"Ubiretama\", \"União da Serra\", \"Unistalda\",\r\n" + 
			"					\"Uruguaiana\", \"Vacaria\", \"Vale do Sol\", \"Vale Real\",\r\n" + 
			"					\"Vale Verde\", \"Vanini\", \"Venâncio Aires\", \"Vera Cruz\",\r\n" + 
			"					\"Veranópolis\", \"Vespasiano Correa\", \"Viadutos\", \"Viamão\",\r\n" + 
			"					\"Vicente Dutra\", \"Victor Graeff\", \"Vila Flores\",\r\n" + 
			"					\"Vila Lângaro\", \"Vila Maria\", \"Vila Nova do Sul\",\r\n" + 
			"					\"Vista Alegre\", \"Vista Alegre do Prata\", \"Vista Gaúcha\",\r\n" + 
			"					\"Vitória das Missões\", \"Westfália\", \"Xangri-lá\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"SC\",\r\n" + 
			"			\"nome\" : \"Santa Catarina\",\r\n" + 
			"			\"cidades\" : [ \"Abdon Batista\", \"Abelardo Luz\", \"Agrolândia\",\r\n" + 
			"					\"Agronômica\", \"Água Doce\", \"Águas de Chapecó\",\r\n" + 
			"					\"Águas Frias\", \"Águas Mornas\", \"Alfredo Wagner\",\r\n" + 
			"					\"Alto Bela Vista\", \"Anchieta\", \"Angelina\",\r\n" + 
			"					\"Anita Garibaldi\", \"Anitápolis\", \"Antônio Carlos\",\r\n" + 
			"					\"Apiúna\", \"Arabutã\", \"Araquari\", \"Araranguá\", \"Armazém\",\r\n" + 
			"					\"Arroio Trinta\", \"Arvoredo\", \"Ascurra\", \"Atalanta\",\r\n" + 
			"					\"Aurora\", \"Balneário Arroio do Silva\",\r\n" + 
			"					\"Balneário Barra do Sul\", \"Balneário Camboriú\",\r\n" + 
			"					\"Balneário Gaivota\", \"Bandeirante\", \"Barra Bonita\",\r\n" + 
			"					\"Barra Velha\", \"Bela Vista do Toldo\", \"Belmonte\",\r\n" + 
			"					\"Benedito Novo\", \"Biguaçu\", \"Blumenau\", \"Bocaina do Sul\",\r\n" + 
			"					\"Bom Jardim da Serra\", \"Bom Jesus\", \"Bom Jesus do Oeste\",\r\n" + 
			"					\"Bom Retiro\", \"Bombinhas\", \"Botuverá\", \"Braço do Norte\",\r\n" + 
			"					\"Braço do Trombudo\", \"Brunópolis\", \"Brusque\", \"Caçador\",\r\n" + 
			"					\"Caibi\", \"Calmon\", \"Camboriú\", \"Campo Alegre\",\r\n" + 
			"					\"Campo Belo do Sul\", \"Campo Erê\", \"Campos Novos\",\r\n" + 
			"					\"Canelinha\", \"Canoinhas\", \"Capão Alto\", \"Capinzal\",\r\n" + 
			"					\"Capivari de Baixo\", \"Catanduvas\", \"Caxambu do Sul\",\r\n" + 
			"					\"Celso Ramos\", \"Cerro Negro\", \"Chapadão do Lageado\",\r\n" + 
			"					\"Chapecó\", \"Cocal do Sul\", \"Concórdia\", \"Cordilheira Alta\",\r\n" + 
			"					\"Coronel Freitas\", \"Coronel Martins\", \"Correia Pinto\",\r\n" + 
			"					\"Corupá\", \"Criciúma\", \"Cunha Porã\", \"Cunhataí\",\r\n" + 
			"					\"Curitibanos\", \"Descanso\", \"Dionísio Cerqueira\",\r\n" + 
			"					\"Dona Emma\", \"Doutor Pedrinho\", \"Entre Rios\", \"Ermo\",\r\n" + 
			"					\"Erval Velho\", \"Faxinal dos Guedes\", \"Flor do Sertão\",\r\n" + 
			"					\"Florianópolis\", \"Formosa do Sul\", \"Forquilhinha\",\r\n" + 
			"					\"Fraiburgo\", \"Frei Rogério\", \"Galvão\", \"Garopaba\",\r\n" + 
			"					\"Garuva\", \"Gaspar\", \"Governador Celso Ramos\", \"Grão Pará\",\r\n" + 
			"					\"Gravatal\", \"Guabiruba\", \"Guaraciaba\", \"Guaramirim\",\r\n" + 
			"					\"Guarujá do Sul\", \"Guatambú\", \"Herval d'Oeste\", \"Ibiam\",\r\n" + 
			"					\"Ibicaré\", \"Ibirama\", \"Içara\", \"Ilhota\", \"Imaruí\",\r\n" + 
			"					\"Imbituba\", \"Imbuia\", \"Indaial\", \"Iomerê\", \"Ipira\",\r\n" + 
			"					\"Iporã do Oeste\", \"Ipuaçu\", \"Ipumirim\", \"Iraceminha\",\r\n" + 
			"					\"Irani\", \"Irati\", \"Irineópolis\", \"Itá\", \"Itaiópolis\",\r\n" + 
			"					\"Itajaí\", \"Itapema\", \"Itapiranga\", \"Itapoá\", \"Ituporanga\",\r\n" + 
			"					\"Jaborá\", \"Jacinto Machado\", \"Jaguaruna\", \"Jaraguá do Sul\",\r\n" + 
			"					\"Jardinópolis\", \"Joaçaba\", \"Joinville\", \"José Boiteux\",\r\n" + 
			"					\"Jupiá\", \"Lacerdópolis\", \"Lages\", \"Laguna\",\r\n" + 
			"					\"Lajeado Grande\", \"Laurentino\", \"Lauro Muller\",\r\n" + 
			"					\"Lebon Régis\", \"Leoberto Leal\", \"Lindóia do Sul\",\r\n" + 
			"					\"Lontras\", \"Luiz Alves\", \"Luzerna\", \"Macieira\", \"Mafra\",\r\n" + 
			"					\"Major Gercino\", \"Major Vieira\", \"Maracajá\", \"Maravilha\",\r\n" + 
			"					\"Marema\", \"Massaranduba\", \"Matos Costa\", \"Meleiro\",\r\n" + 
			"					\"Mirim Doce\", \"Modelo\", \"Mondaí\", \"Monte Carlo\",\r\n" + 
			"					\"Monte Castelo\", \"Morro da Fumaça\", \"Morro Grande\",\r\n" + 
			"					\"Navegantes\", \"Nova Erechim\", \"Nova Itaberaba\",\r\n" + 
			"					\"Nova Trento\", \"Nova Veneza\", \"Novo Horizonte\", \"Orleans\",\r\n" + 
			"					\"Otacílio Costa\", \"Ouro\", \"Ouro Verde\", \"Paial\", \"Painel\",\r\n" + 
			"					\"Palhoça\", \"Palma Sola\", \"Palmeira\", \"Palmitos\",\r\n" + 
			"					\"Papanduva\", \"Paraíso\", \"Passo de Torres\", \"Passos Maia\",\r\n" + 
			"					\"Paulo Lopes\", \"Pedras Grandes\", \"Penha\", \"Peritiba\",\r\n" + 
			"					\"Petrolândia\", \"Piçarras\", \"Pinhalzinho\", \"Pinheiro Preto\",\r\n" + 
			"					\"Piratuba\", \"Planalto Alegre\", \"Pomerode\", \"Ponte Alta\",\r\n" + 
			"					\"Ponte Alta do Norte\", \"Ponte Serrada\", \"Porto Belo\",\r\n" + 
			"					\"Porto União\", \"Pouso Redondo\", \"Praia Grande\",\r\n" + 
			"					\"Presidente Castelo Branco\", \"Presidente Getúlio\",\r\n" + 
			"					\"Presidente Nereu\", \"Princesa\", \"Quilombo\",\r\n" + 
			"					\"Rancho Queimado\", \"Rio das Antas\", \"Rio do Campo\",\r\n" + 
			"					\"Rio do Oeste\", \"Rio do Sul\", \"Rio dos Cedros\",\r\n" + 
			"					\"Rio Fortuna\", \"Rio Negrinho\", \"Rio Rufino\", \"Riqueza\",\r\n" + 
			"					\"Rodeio\", \"Romelândia\", \"Salete\", \"Saltinho\",\r\n" + 
			"					\"Salto Veloso\", \"Sangão\", \"Santa Cecília\", \"Santa Helena\",\r\n" + 
			"					\"Santa Rosa de Lima\", \"Santa Rosa do Sul\",\r\n" + 
			"					\"Santa Terezinha\", \"Santa Terezinha do Progresso\",\r\n" + 
			"					\"Santiago do Sul\", \"Santo Amaro da Imperatriz\",\r\n" + 
			"					\"São Bento do Sul\", \"São Bernardino\", \"São Bonifácio\",\r\n" + 
			"					\"São Carlos\", \"São Cristovão do Sul\", \"São Domingos\",\r\n" + 
			"					\"São Francisco do Sul\", \"São João Batista\",\r\n" + 
			"					\"São João do Itaperiú\", \"São João do Oeste\",\r\n" + 
			"					\"São João do Sul\", \"São Joaquim\", \"São José\",\r\n" + 
			"					\"São José do Cedro\", \"São José do Cerrito\",\r\n" + 
			"					\"São Lourenço do Oeste\", \"São Ludgero\", \"São Martinho\",\r\n" + 
			"					\"São Miguel da Boa Vista\", \"São Miguel do Oeste\",\r\n" + 
			"					\"São Pedro de Alcântara\", \"Saudades\", \"Schroeder\", \"Seara\",\r\n" + 
			"					\"Serra Alta\", \"Siderópolis\", \"Sombrio\", \"Sul Brasil\",\r\n" + 
			"					\"Taió\", \"Tangará\", \"Tigrinhos\", \"Tijucas\", \"Timbé do Sul\",\r\n" + 
			"					\"Timbó\", \"Timbó Grande\", \"Três Barras\", \"Treviso\",\r\n" + 
			"					\"Treze de Maio\", \"Treze Tílias\", \"Trombudo Central\",\r\n" + 
			"					\"Tubarão\", \"Tunápolis\", \"Turvo\", \"União do Oeste\",\r\n" + 
			"					\"Urubici\", \"Urupema\", \"Urussanga\", \"Vargeão\", \"Vargem\",\r\n" + 
			"					\"Vargem Bonita\", \"Vidal Ramos\", \"Videira\",\r\n" + 
			"					\"Vitor Meireles\", \"Witmarsum\", \"Xanxerê\", \"Xavantina\",\r\n" + 
			"					\"Xaxim\", \"Zortéa\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"SE\",\r\n" + 
			"			\"nome\" : \"Sergipe\",\r\n" + 
			"			\"cidades\" : [ \"Amparo de São Francisco\", \"Aquidabã\", \"Aracaju\",\r\n" + 
			"					\"Arauá\", \"Areia Branca\", \"Barra dos Coqueiros\", \"Boquim\",\r\n" + 
			"					\"Brejo Grande\", \"Campo do Brito\", \"Canhoba\",\r\n" + 
			"					\"Canindé de São Francisco\", \"Capela\", \"Carira\",\r\n" + 
			"					\"Carmópolis\", \"Cedro de São João\", \"Cristinápolis\",\r\n" + 
			"					\"Cumbe\", \"Divina Pastora\", \"Estância\", \"Feira Nova\",\r\n" + 
			"					\"Frei Paulo\", \"Gararu\", \"General Maynard\",\r\n" + 
			"					\"Gracho Cardoso\", \"Ilha das Flores\", \"Indiaroba\",\r\n" + 
			"					\"Itabaiana\", \"Itabaianinha\", \"Itabi\", \"Itaporanga d'Ajuda\",\r\n" + 
			"					\"Japaratuba\", \"Japoatã\", \"Lagarto\", \"Laranjeiras\",\r\n" + 
			"					\"Macambira\", \"Malhada dos Bois\", \"Malhador\", \"Maruim\",\r\n" + 
			"					\"Moita Bonita\", \"Monte Alegre de Sergipe\", \"Muribeca\",\r\n" + 
			"					\"Neópolis\", \"Nossa Senhora Aparecida\",\r\n" + 
			"					\"Nossa Senhora da Glória\", \"Nossa Senhora das Dores\",\r\n" + 
			"					\"Nossa Senhora de Lourdes\", \"Nossa Senhora do Socorro\",\r\n" + 
			"					\"Pacatuba\", \"Pedra Mole\", \"Pedrinhas\", \"Pinhão\", \"Pirambu\",\r\n" + 
			"					\"Poço Redondo\", \"Poço Verde\", \"Porto da Folha\", \"Propriá\",\r\n" + 
			"					\"Riachão do Dantas\", \"Riachuelo\", \"Ribeirópolis\",\r\n" + 
			"					\"Rosário do Catete\", \"Salgado\", \"Santa Luzia do Itanhy\",\r\n" + 
			"					\"Santa Rosa de Lima\", \"Santana do São Francisco\",\r\n" + 
			"					\"Santo Amaro das Brotas\", \"São Cristóvão\", \"São Domingos\",\r\n" + 
			"					\"São Francisco\", \"São Miguel do Aleixo\", \"Simão Dias\",\r\n" + 
			"					\"Siriri\", \"Telha\", \"Tobias Barreto\", \"Tomar do Geru\",\r\n" + 
			"					\"Umbaúba\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"SP\",\r\n" + 
			"			\"nome\" : \"São Paulo\",\r\n" + 
			"			\"cidades\" : [ \"Adamantina\", \"Adolfo\", \"Aguaí\", \"Águas da Prata\",\r\n" + 
			"					\"Águas de Lindóia\", \"Águas de Santa Bárbara\",\r\n" + 
			"					\"Águas de São Pedro\", \"Agudos\", \"Alambari\",\r\n" + 
			"					\"Alfredo Marcondes\", \"Altair\", \"Altinópolis\",\r\n" + 
			"					\"Alto Alegre\", \"Alumínio\", \"Álvares Florence\",\r\n" + 
			"					\"Álvares Machado\", \"Álvaro de Carvalho\", \"Alvinlândia\",\r\n" + 
			"					\"Americana\", \"Américo Brasiliense\", \"Américo de Campos\",\r\n" + 
			"					\"Amparo\", \"Analândia\", \"Andradina\", \"Angatuba\", \"Anhembi\",\r\n" + 
			"					\"Anhumas\", \"Aparecida\", \"Aparecida d'Oeste\", \"Apiaí\",\r\n" + 
			"					\"Araçariguama\", \"Araçatuba\", \"Araçoiaba da Serra\",\r\n" + 
			"					\"Aramina\", \"Arandu\", \"Arapeí\", \"Araraquara\", \"Araras\",\r\n" + 
			"					\"Arco-Íris\", \"Arealva\", \"Areias\", \"Areiópolis\", \"Ariranha\",\r\n" + 
			"					\"Artur Nogueira\", \"Arujá\", \"Aspásia\", \"Assis\", \"Atibaia\",\r\n" + 
			"					\"Auriflama\", \"Avaí\", \"Avanhandava\", \"Avaré\",\r\n" + 
			"					\"Bady Bassitt\", \"Balbinos\", \"Bálsamo\", \"Bananal\",\r\n" + 
			"					\"Barão de Antonina\", \"Barbosa\", \"Bariri\", \"Barra Bonita\",\r\n" + 
			"					\"Barra do Chapéu\", \"Barra do Turvo\", \"Barretos\",\r\n" + 
			"					\"Barrinha\", \"Barueri\", \"Bastos\", \"Batatais\", \"Bauru\",\r\n" + 
			"					\"Bebedouro\", \"Bento de Abreu\", \"Bernardino de Campos\",\r\n" + 
			"					\"Bertioga\", \"Bilac\", \"Birigui\", \"Biritiba-Mirim\",\r\n" + 
			"					\"Boa Esperança do Sul\", \"Bocaina\", \"Bofete\", \"Boituva\",\r\n" + 
			"					\"Bom Jesus dos Perdões\", \"Bom Sucesso de Itararé\", \"Borá\",\r\n" + 
			"					\"Boracéia\", \"Borborema\", \"Borebi\", \"Botucatu\",\r\n" + 
			"					\"Bragança Paulista\", \"Braúna\", \"Brejo Alegre\", \"Brodowski\",\r\n" + 
			"					\"Brotas\", \"Buri\", \"Buritama\", \"Buritizal\",\r\n" + 
			"					\"Cabrália Paulista\", \"Cabreúva\", \"Caçapava\",\r\n" + 
			"					\"Cachoeira Paulista\", \"Caconde\", \"Cafelândia\", \"Caiabu\",\r\n" + 
			"					\"Caieiras\", \"Caiuá\", \"Cajamar\", \"Cajati\", \"Cajobi\",\r\n" + 
			"					\"Cajuru\", \"Campina do Monte Alegre\", \"Campinas\",\r\n" + 
			"					\"Campo Limpo Paulista\", \"Campos do Jordão\",\r\n" + 
			"					\"Campos Novos Paulista\", \"Cananéia\", \"Canas\",\r\n" + 
			"					\"Cândido Mota\", \"Cândido Rodrigues\", \"Canitar\",\r\n" + 
			"					\"Capão Bonito\", \"Capela do Alto\", \"Capivari\",\r\n" + 
			"					\"Caraguatatuba\", \"Carapicuíba\", \"Cardoso\", \"Casa Branca\",\r\n" + 
			"					\"Cássia dos Coqueiros\", \"Castilho\", \"Catanduva\", \"Catiguá\",\r\n" + 
			"					\"Cedral\", \"Cerqueira César\", \"Cerquilho\", \"Cesário Lange\",\r\n" + 
			"					\"Charqueada\", \"Chavantes\", \"Clementina\", \"Colina\",\r\n" + 
			"					\"Colômbia\", \"Conchal\", \"Conchas\", \"Cordeirópolis\",\r\n" + 
			"					\"Coroados\", \"Coronel Macedo\", \"Corumbataí\", \"Cosmópolis\",\r\n" + 
			"					\"Cosmorama\", \"Cotia\", \"Cravinhos\", \"Cristais Paulista\",\r\n" + 
			"					\"Cruzália\", \"Cruzeiro\", \"Cubatão\", \"Cunha\", \"Descalvado\",\r\n" + 
			"					\"Diadema\", \"Dirce Reis\", \"Divinolândia\", \"Dobrada\",\r\n" + 
			"					\"Dois Córregos\", \"Dolcinópolis\", \"Dourado\", \"Dracena\",\r\n" + 
			"					\"Duartina\", \"Dumont\", \"Echaporã\", \"Eldorado\",\r\n" + 
			"					\"Elias Fausto\", \"Elisiário\", \"Embaúba\", \"Embu\",\r\n" + 
			"					\"Embu-Guaçu\", \"Emilianópolis\", \"Engenheiro Coelho\",\r\n" + 
			"					\"Espírito Santo do Pinhal\", \"Espírito Santo do Turvo\",\r\n" + 
			"					\"Estiva Gerbi\", \"Estrela d'Oeste\", \"Estrela do Norte\",\r\n" + 
			"					\"Euclides da Cunha Paulista\", \"Fartura\",\r\n" + 
			"					\"Fernando Prestes\", \"Fernandópolis\", \"Fernão\",\r\n" + 
			"					\"Ferraz de Vasconcelos\", \"Flora Rica\", \"Floreal\",\r\n" + 
			"					\"Florínia\", \"Flórida Paulista\", \"Franca\",\r\n" + 
			"					\"Francisco Morato\", \"Franco da Rocha\", \"Gabriel Monteiro\",\r\n" + 
			"					\"Gália\", \"Garça\", \"Gastão Vidigal\", \"Gavião Peixoto\",\r\n" + 
			"					\"General Salgado\", \"Getulina\", \"Glicério\", \"Guaiçara\",\r\n" + 
			"					\"Guaimbê\", \"Guaíra\", \"Guapiaçu\", \"Guapiara\", \"Guará\",\r\n" + 
			"					\"Guaraçaí\", \"Guaraci\", \"Guarani d'Oeste\", \"Guarantã\",\r\n" + 
			"					\"Guararapes\", \"Guararema\", \"Guaratinguetá\", \"Guareí\",\r\n" + 
			"					\"Guariba\", \"Guarujá\", \"Guarulhos\", \"Guatapará\",\r\n" + 
			"					\"Guzolândia\", \"Herculândia\", \"Holambra\", \"Hortolândia\",\r\n" + 
			"					\"Iacanga\", \"Iacri\", \"Iaras\", \"Ibaté\", \"Ibirá\", \"Ibirarema\",\r\n" + 
			"					\"Ibitinga\", \"Ibiúna\", \"Icém\", \"Iepê\", \"Igaraçu do Tietê\",\r\n" + 
			"					\"Igarapava\", \"Igaratá\", \"Iguape\", \"Ilha Comprida\",\r\n" + 
			"					\"Ilha Solteira\", \"Ilhabela\", \"Indaiatuba\", \"Indiana\",\r\n" + 
			"					\"Indiaporã\", \"Inúbia Paulista\", \"Ipauçu\", \"Iperó\",\r\n" + 
			"					\"Ipeúna\", \"Ipiguá\", \"Iporanga\", \"Ipuã\", \"Iracemápolis\",\r\n" + 
			"					\"Irapuã\", \"Irapuru\", \"Itaberá\", \"Itaí\", \"Itajobi\", \"Itaju\",\r\n" + 
			"					\"Itanhaém\", \"Itaóca\", \"Itapecerica da Serra\",\r\n" + 
			"					\"Itapetininga\", \"Itapeva\", \"Itapevi\", \"Itapira\",\r\n" + 
			"					\"Itapirapuã Paulista\", \"Itápolis\", \"Itaporanga\", \"Itapuí\",\r\n" + 
			"					\"Itapura\", \"Itaquaquecetuba\", \"Itararé\", \"Itariri\",\r\n" + 
			"					\"Itatiba\", \"Itatinga\", \"Itirapina\", \"Itirapuã\", \"Itobi\",\r\n" + 
			"					\"Itu\", \"Itupeva\", \"Ituverava\", \"Jaborandi\", \"Jaboticabal\",\r\n" + 
			"					\"Jacareí\", \"Jaci\", \"Jacupiranga\", \"Jaguariúna\", \"Jales\",\r\n" + 
			"					\"Jambeiro\", \"Jandira\", \"Jardinópolis\", \"Jarinu\", \"Jaú\",\r\n" + 
			"					\"Jeriquara\", \"Joanópolis\", \"João Ramalho\",\r\n" + 
			"					\"José Bonifácio\", \"Júlio Mesquita\", \"Jumirim\", \"Jundiaí\",\r\n" + 
			"					\"Junqueirópolis\", \"Juquiá\", \"Juquitiba\", \"Lagoinha\",\r\n" + 
			"					\"Laranjal Paulista\", \"Lavínia\", \"Lavrinhas\", \"Leme\",\r\n" + 
			"					\"Lençóis Paulista\", \"Limeira\", \"Lindóia\", \"Lins\", \"Lorena\",\r\n" + 
			"					\"Lourdes\", \"Louveira\", \"Lucélia\", \"Lucianópolis\",\r\n" + 
			"					\"Luís Antônio\", \"Luiziânia\", \"Lupércio\", \"Lutécia\",\r\n" + 
			"					\"Macatuba\", \"Macaubal\", \"Macedônia\", \"Magda\", \"Mairinque\",\r\n" + 
			"					\"Mairiporã\", \"Manduri\", \"Marabá Paulista\", \"Maracaí\",\r\n" + 
			"					\"Marapoama\", \"Mariápolis\", \"Marília\", \"Marinópolis\",\r\n" + 
			"					\"Martinópolis\", \"Matão\", \"Mauá\", \"Mendonça\", \"Meridiano\",\r\n" + 
			"					\"Mesópolis\", \"Miguelópolis\", \"Mineiros do Tietê\",\r\n" + 
			"					\"Mira Estrela\", \"Miracatu\", \"Mirandópolis\",\r\n" + 
			"					\"Mirante do Paranapanema\", \"Mirassol\", \"Mirassolândia\",\r\n" + 
			"					\"Mococa\", \"Mogi das Cruzes\", \"Mogi-Guaçu\", \"Mogi-Mirim\",\r\n" + 
			"					\"Mombuca\", \"Monções\", \"Mongaguá\", \"Monte Alegre do Sul\",\r\n" + 
			"					\"Monte Alto\", \"Monte Aprazível\", \"Monte Azul Paulista\",\r\n" + 
			"					\"Monte Castelo\", \"Monte Mor\", \"Monteiro Lobato\",\r\n" + 
			"					\"Morro Agudo\", \"Morungaba\", \"Motuca\", \"Murutinga do Sul\",\r\n" + 
			"					\"Nantes\", \"Narandiba\", \"Natividade da Serra\",\r\n" + 
			"					\"Nazaré Paulista\", \"Neves Paulista\", \"Nhandeara\", \"Nipoã\",\r\n" + 
			"					\"Nova Aliança\", \"Nova Campina\", \"Nova Canaã Paulista\",\r\n" + 
			"					\"Nova Castilho\", \"Nova Europa\", \"Nova Granada\",\r\n" + 
			"					\"Nova Guataporanga\", \"Nova Independência\",\r\n" + 
			"					\"Nova Luzitânia\", \"Nova Odessa\", \"Novais\",\r\n" + 
			"					\"Novo Horizonte\", \"Nuporanga\", \"Ocauçu\", \"Óleo\", \"Olímpia\",\r\n" + 
			"					\"Onda Verde\", \"Oriente\", \"Orindiúva\", \"Orlândia\", \"Osasco\",\r\n" + 
			"					\"Oscar Bressane\", \"Osvaldo Cruz\", \"Ourinhos\", \"Ouro Verde\",\r\n" + 
			"					\"Ouroeste\", \"Pacaembu\", \"Palestina\", \"Palmares Paulista\",\r\n" + 
			"					\"Palmeira d'Oeste\", \"Palmital\", \"Panorama\",\r\n" + 
			"					\"Paraguaçu Paulista\", \"Paraibuna\", \"Paraíso\",\r\n" + 
			"					\"Paranapanema\", \"Paranapuã\", \"Parapuã\", \"Pardinho\",\r\n" + 
			"					\"Pariquera-Açu\", \"Parisi\", \"Patrocínio Paulista\",\r\n" + 
			"					\"Paulicéia\", \"Paulínia\", \"Paulistânia\", \"Paulo de Faria\",\r\n" + 
			"					\"Pederneiras\", \"Pedra Bela\", \"Pedranópolis\", \"Pedregulho\",\r\n" + 
			"					\"Pedreira\", \"Pedrinhas Paulista\", \"Pedro de Toledo\",\r\n" + 
			"					\"Penápolis\", \"Pereira Barreto\", \"Pereiras\", \"Peruíbe\",\r\n" + 
			"					\"Piacatu\", \"Piedade\", \"Pilar do Sul\", \"Pindamonhangaba\",\r\n" + 
			"					\"Pindorama\", \"Pinhalzinho\", \"Piquerobi\", \"Piquete\",\r\n" + 
			"					\"Piracaia\", \"Piracicaba\", \"Piraju\", \"Pirajuí\", \"Pirangi\",\r\n" + 
			"					\"Pirapora do Bom Jesus\", \"Pirapozinho\", \"Pirassununga\",\r\n" + 
			"					\"Piratininga\", \"Pitangueiras\", \"Planalto\", \"Platina\",\r\n" + 
			"					\"Poá\", \"Poloni\", \"Pompéia\", \"Pongaí\", \"Pontal\",\r\n" + 
			"					\"Pontalinda\", \"Pontes Gestal\", \"Populina\", \"Porangaba\",\r\n" + 
			"					\"Porto Feliz\", \"Porto Ferreira\", \"Potim\", \"Potirendaba\",\r\n" + 
			"					\"Pracinha\", \"Pradópolis\", \"Praia Grande\", \"Pratânia\",\r\n" + 
			"					\"Presidente Alves\", \"Presidente Bernardes\",\r\n" + 
			"					\"Presidente Epitácio\", \"Presidente Prudente\",\r\n" + 
			"					\"Presidente Venceslau\", \"Promissão\", \"Quadra\", \"Quatá\",\r\n" + 
			"					\"Queiroz\", \"Queluz\", \"Quintana\", \"Rafard\", \"Rancharia\",\r\n" + 
			"					\"Redenção da Serra\", \"Regente Feijó\", \"Reginópolis\",\r\n" + 
			"					\"Registro\", \"Restinga\", \"Ribeira\", \"Ribeirão Bonito\",\r\n" + 
			"					\"Ribeirão Branco\", \"Ribeirão Corrente\", \"Ribeirão do Sul\",\r\n" + 
			"					\"Ribeirão dos Índios\", \"Ribeirão Grande\", \"Ribeirão Pires\",\r\n" + 
			"					\"Ribeirão Preto\", \"Rifaina\", \"Rincão\", \"Rinópolis\",\r\n" + 
			"					\"Rio Claro\", \"Rio das Pedras\", \"Rio Grande da Serra\",\r\n" + 
			"					\"Riolândia\", \"Riversul\", \"Rosana\", \"Roseira\", \"Rubiácea\",\r\n" + 
			"					\"Rubinéia\", \"Sabino\", \"Sagres\", \"Sales\", \"Sales Oliveira\",\r\n" + 
			"					\"Salesópolis\", \"Salmourão\", \"Saltinho\", \"Salto\",\r\n" + 
			"					\"Salto de Pirapora\", \"Salto Grande\", \"Sandovalina\",\r\n" + 
			"					\"Santa Adélia\", \"Santa Albertina\", \"Santa Bárbara d'Oeste\",\r\n" + 
			"					\"Santa Branca\", \"Santa Clara d'Oeste\",\r\n" + 
			"					\"Santa Cruz da Conceição\", \"Santa Cruz da Esperança\",\r\n" + 
			"					\"Santa Cruz das Palmeiras\", \"Santa Cruz do Rio Pardo\",\r\n" + 
			"					\"Santa Ernestina\", \"Santa Fé do Sul\", \"Santa Gertrudes\",\r\n" + 
			"					\"Santa Isabel\", \"Santa Lúcia\", \"Santa Maria da Serra\",\r\n" + 
			"					\"Santa Mercedes\", \"Santa Rita d'Oeste\",\r\n" + 
			"					\"Santa Rita do Passa Quatro\", \"Santa Rosa de Viterbo\",\r\n" + 
			"					\"Santa Salete\", \"Santana da Ponte Pensa\",\r\n" + 
			"					\"Santana de Parnaíba\", \"Santo Anastácio\", \"Santo André\",\r\n" + 
			"					\"Santo Antônio da Alegria\", \"Santo Antônio de Posse\",\r\n" + 
			"					\"Santo Antônio do Aracanguá\", \"Santo Antônio do Jardim\",\r\n" + 
			"					\"Santo Antônio do Pinhal\", \"Santo Expedito\",\r\n" + 
			"					\"Santópolis do Aguapeí\", \"Santos\", \"São Bento do Sapucaí\",\r\n" + 
			"					\"São Bernardo do Campo\", \"São Caetano do Sul\",\r\n" + 
			"					\"São Carlos\", \"São Francisco\", \"São João da Boa Vista\",\r\n" + 
			"					\"São João das Duas Pontes\", \"São João de Iracema\",\r\n" + 
			"					\"São João do Pau d'Alho\", \"São Joaquim da Barra\",\r\n" + 
			"					\"São José da Bela Vista\", \"São José do Barreiro\",\r\n" + 
			"					\"São José do Rio Pardo\", \"São José do Rio Preto\",\r\n" + 
			"					\"São José dos Campos\", \"São Lourenço da Serra\",\r\n" + 
			"					\"São Luís do Paraitinga\", \"São Manuel\",\r\n" + 
			"					\"São Miguel Arcanjo\", \"São Paulo\", \"São Pedro\",\r\n" + 
			"					\"São Pedro do Turvo\", \"São Roque\", \"São Sebastião\",\r\n" + 
			"					\"São Sebastião da Grama\", \"São Simão\", \"São Vicente\",\r\n" + 
			"					\"Sarapuí\", \"Sarutaiá\", \"Sebastianópolis do Sul\",\r\n" + 
			"					\"Serra Azul\", \"Serra Negra\", \"Serrana\", \"Sertãozinho\",\r\n" + 
			"					\"Sete Barras\", \"Severínia\", \"Silveiras\", \"Socorro\",\r\n" + 
			"					\"Sorocaba\", \"Sud Mennucci\", \"Sumaré\", \"Suzanápolis\",\r\n" + 
			"					\"Suzano\", \"Tabapuã\", \"Tabatinga\", \"Taboão da Serra\",\r\n" + 
			"					\"Taciba\", \"Taguaí\", \"Taiaçu\", \"Taiúva\", \"Tambaú\", \"Tanabi\",\r\n" + 
			"					\"Tapiraí\", \"Tapiratiba\", \"Taquaral\", \"Taquaritinga\",\r\n" + 
			"					\"Taquarituba\", \"Taquarivaí\", \"Tarabai\", \"Tarumã\", \"Tatuí\",\r\n" + 
			"					\"Taubaté\", \"Tejupá\", \"Teodoro Sampaio\", \"Terra Roxa\",\r\n" + 
			"					\"Tietê\", \"Timburi\", \"Torre de Pedra\", \"Torrinha\",\r\n" + 
			"					\"Trabiju\", \"Tremembé\", \"Três Fronteiras\", \"Tuiuti\", \"Tupã\",\r\n" + 
			"					\"Tupi Paulista\", \"Turiúba\", \"Turmalina\", \"Ubarana\",\r\n" + 
			"					\"Ubatuba\", \"Ubirajara\", \"Uchoa\", \"União Paulista\",\r\n" + 
			"					\"Urânia\", \"Uru\", \"Urupês\", \"Valentim Gentil\", \"Valinhos\",\r\n" + 
			"					\"Valparaíso\", \"Vargem\", \"Vargem Grande do Sul\",\r\n" + 
			"					\"Vargem Grande Paulista\", \"Várzea Paulista\", \"Vera Cruz\",\r\n" + 
			"					\"Vinhedo\", \"Viradouro\", \"Vista Alegre do Alto\",\r\n" + 
			"					\"Vitória Brasil\", \"Votorantim\", \"Votuporanga\", \"Zacarias\" ]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"sigla\" : \"TO\",\r\n" + 
			"			\"nome\" : \"Tocantins\",\r\n" + 
			"			\"cidades\" : [ \"Abreulândia\", \"Aguiarnópolis\",\r\n" + 
			"					\"Aliança do Tocantins\", \"Almas\", \"Alvorada\", \"Ananás\",\r\n" + 
			"					\"Angico\", \"Aparecida do Rio Negro\", \"Aragominas\",\r\n" + 
			"					\"Araguacema\", \"Araguaçu\", \"Araguaína\", \"Araguanã\",\r\n" + 
			"					\"Araguatins\", \"Arapoema\", \"Arraias\", \"Augustinópolis\",\r\n" + 
			"					\"Aurora do Tocantins\", \"Axixá do Tocantins\",\r\n" + 
			"					\"Babaçulândia\", \"Bandeirantes do Tocantins\",\r\n" + 
			"					\"Barra do Ouro\", \"Barrolândia\", \"Bernardo Sayão\",\r\n" + 
			"					\"Bom Jesus do Tocantins\", \"Brasilândia do Tocantins\",\r\n" + 
			"					\"Brejinho de Nazaré\", \"Buriti do Tocantins\",\r\n" + 
			"					\"Cachoeirinha\", \"Campos Lindos\", \"Cariri do Tocantins\",\r\n" + 
			"					\"Carmolândia\", \"Carrasco Bonito\", \"Caseara\", \"Centenário\",\r\n" + 
			"					\"Chapada da Natividade\", \"Chapada de Areia\",\r\n" + 
			"					\"Colinas do Tocantins\", \"Colméia\", \"Combinado\",\r\n" + 
			"					\"Conceição do Tocantins\", \"Couto de Magalhães\",\r\n" + 
			"					\"Cristalândia\", \"Crixás do Tocantins\", \"Darcinópolis\",\r\n" + 
			"					\"Dianópolis\", \"Divinópolis do Tocantins\",\r\n" + 
			"					\"Dois Irmãos do Tocantins\", \"Dueré\", \"Esperantina\",\r\n" + 
			"					\"Fátima\", \"Figueirópolis\", \"Filadélfia\",\r\n" + 
			"					\"Formoso do Araguaia\", \"Fortaleza do Tabocão\", \"Goianorte\",\r\n" + 
			"					\"Goiatins\", \"Guaraí\", \"Gurupi\", \"Ipueiras\", \"Itacajá\",\r\n" + 
			"					\"Itaguatins\", \"Itapiratins\", \"Itaporã do Tocantins\",\r\n" + 
			"					\"Jaú do Tocantins\", \"Juarina\", \"Lagoa da Confusão\",\r\n" + 
			"					\"Lagoa do Tocantins\", \"Lajeado\", \"Lavandeira\", \"Lizarda\",\r\n" + 
			"					\"Luzinópolis\", \"Marianópolis do Tocantins\", \"Mateiros\",\r\n" + 
			"					\"Maurilândia do Tocantins\", \"Miracema do Tocantins\",\r\n" + 
			"					\"Miranorte\", \"Monte do Carmo\", \"Monte Santo do Tocantins\",\r\n" + 
			"					\"Muricilândia\", \"Natividade\", \"Nazaré\", \"Nova Olinda\",\r\n" + 
			"					\"Nova Rosalândia\", \"Novo Acordo\", \"Novo Alegre\",\r\n" + 
			"					\"Novo Jardim\", \"Oliveira de Fátima\", \"Palmas\",\r\n" + 
			"					\"Palmeirante\", \"Palmeiras do Tocantins\", \"Palmeirópolis\",\r\n" + 
			"					\"Paraíso do Tocantins\", \"Paranã\", \"Pau d'Arco\",\r\n" + 
			"					\"Pedro Afonso\", \"Peixe\", \"Pequizeiro\",\r\n" + 
			"					\"Pindorama do Tocantins\", \"Piraquê\", \"Pium\",\r\n" + 
			"					\"Ponte Alta do Bom Jesus\", \"Ponte Alta do Tocantins\",\r\n" + 
			"					\"Porto Alegre do Tocantins\", \"Porto Nacional\",\r\n" + 
			"					\"Praia Norte\", \"Presidente Kennedy\", \"Pugmil\",\r\n" + 
			"					\"Recursolândia\", \"Riachinho\", \"Rio da Conceição\",\r\n" + 
			"					\"Rio dos Bois\", \"Rio Sono\", \"Sampaio\", \"Sandolândia\",\r\n" + 
			"					\"Santa Fé do Araguaia\", \"Santa Maria do Tocantins\",\r\n" + 
			"					\"Santa Rita do Tocantins\", \"Santa Rosa do Tocantins\",\r\n" + 
			"					\"Santa Tereza do Tocantins\", \"Santa Terezinha Tocantins\",\r\n" + 
			"					\"São Bento do Tocantins\", \"São Félix do Tocantins\",\r\n" + 
			"					\"São Miguel do Tocantins\", \"São Salvador do Tocantins\",\r\n" + 
			"					\"São Sebastião do Tocantins\", \"São Valério da Natividade\",\r\n" + 
			"					\"Silvanópolis\", \"Sítio Novo do Tocantins\", \"Sucupira\",\r\n" + 
			"					\"Taguatinga\", \"Taipas do Tocantins\", \"Talismã\",\r\n" + 
			"					\"Tocantínia\", \"Tocantinópolis\", \"Tupirama\", \"Tupiratins\",\r\n" + 
			"					\"Wanderlândia\", \"Xambioá\" ]\r\n" + 
			"		}\r\n" + 
			"	]\r\n" + 
			"}";
	private JSONObject jsonObject = new JSONObject(strJson);
	private JSONArray jsonArray = jsonObject.getJSONArray("estados");
	
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	
	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	public JSONArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}
	
	public List<String> getEstados(){
		List<String> estados = new ArrayList<String>();
		
		for (int index = 0; index < jsonArray.length(); index++) {
			estados.add(jsonArray.getJSONObject(index).getString("nome"));
		}
		
		return estados;
	}
	
	public List<String> getCidades(String estado){
		List<String> cidades = new ArrayList<String>();
		
		for (int index = 0; index < jsonArray.length(); index++) {
			if (estado.equals(jsonArray.getJSONObject(index).getString("nome"))) {
				JSONArray jArray = jsonArray.getJSONObject(index).getJSONArray("cidades");
				
				for (int i = 0; i < jArray.length(); i++) {
					cidades.add(jArray.getString(i));
				}
			}
		}
		
		return cidades;
	}
}
