#include <iostream>
#include <cstdlib>
#include <clocale>
#include <cstring>
#include <sstream>

using namespace std;

int main(){

  setlocale(LC_ALL, "Portuguese");

  system("title CRIPTOGRAFIA E DESCRIPTOGRAFIA");

  system("color 0e");

  stringstream convert;
  istringstream num;

  int i  = 0;
  int x  = 0;
  int op  = 0;
  int pos  = 0;
  int tamL = 0;
  int tamN = 0;

  int const CRIPTOGRAFAR  = 1;
  int const DESCRIPTOGRAFAR  = 2;
  int const PALAVRAS  = 3;
  int const LISTAR  = 4;
  int const SAIR  = 5;

  string frase = "";
  string auxDecrypt = "";
  string criptografadas[100];

  char  letras[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
  'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
  'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};

  int numeros[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
  42, 44, 46, 48, 50, 52, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27,
  29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53};

  do{

  cout << "1. Criptografar." << endl
  << "2. Descriptografar." << endl
  << "3. Descriptografar todas as palavras." << endl
  << "4. Listar palavras criptografadas."<< endl
  << "5. Sair." << endl << endl;
  cin >> op;

  system("cls");

  switch(op){

  case CRIPTOGRAFAR:

  cin.ignore();
  system("cls");
  cout << "Digite a palavra ou frase desejada:" << endl;
  getline(cin,frase);
  tamL = frase.length();
  for (int p = 0; p < tamL; p++){
  for (int j = 0; j < 53; j++){
  if (frase[p] == letras[j]){
  convert << numeros[j] << " ";
  }
  }
  }

  criptografadas[i] = convert.str();
  cout << convert.str();

  i++;
  x = i;

  convert.clear();
  convert.str("");

  cout  << endl << endl;
  system("pause");
  system("cls");

  break;

  case DESCRIPTOGRAFAR:


  cout << "Escolha o indice da palavra que deseja descriptografar:" << endl;
  for(int i = 0; i < x; i++){
  cout << i << ". " << criptografadas[i] << endl;
  }

  cout  << endl << endl;
  cout << "Digite o número de indice: ";
  cin >> pos;

  auxDecrypt = criptografadas[pos];
  tamN = auxDecrypt.length();
  num.str(auxDecrypt);

  for (int n = 0; n < tamN; n++){
  pos = 0;
  num >> pos;
  for (int j = 0; j < 53; j++){
  if (pos == numeros[j]){
  convert << letras[j];
  }
  }
  }

  cout << convert.str() << endl;
  convert.clear();
  convert.str("");
  num.clear();
  num.str("");

  cout  << endl << endl;
  system("pause");
  system("cls");

  break;

  case PALAVRAS:

  for(int cont = 0; cont < x; cont++){
  auxDecrypt = criptografadas[cont];
  tamN = auxDecrypt.length();
  num.str(auxDecrypt);

  for (int n = 0; n < tamN; n++){
  pos = 0;
  num >> pos;
  for (int j = 0; j < 53; j++){
  if (pos == numeros[j]){
  convert << letras[j];
  }
  }
  }

  cout << convert.str() << endl;
  convert.clear();
  convert.str("");
  num.clear();
  num.str("");
  }

  cout  << endl << endl;
  system("pause");
  system("cls");

  break;

  case LISTAR:

  for(int i = 0; i < x; i++){
  cout << i << ". " << criptografadas[i] << endl;
  }

  cout  << endl << endl;
  system("pause");
  system("cls");

  break;

  default:

  system("cls");
  cout << "Opção inválida." << endl << endl;
  system("pause");
  system("cls");

  break;

  case SAIR:

  break;

  }

  } while(op != 5);

  return 0;

}