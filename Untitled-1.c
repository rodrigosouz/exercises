#include<conio.h>
#include<stdio.h>
#include<string.h>
int main(){
	char msg[999];
	char crip_msg[999];
	int tam_msg;
	int i;
	int escolha;

	//menu
	printf("Digite 1-Criptografar\n 2-Descriptografar");
	scanf("%d",&escolha);

	if(escolha == 1){
	//crip
	printf("\n Digite texto ou palavra a ser criptografada:");
	scanf("%s",msg);
	
    tam_msg = strlen(msg);
	for(i=0;i<tam_msg;i++)
	{
		crip_msg = (msg) *4 ;
	}

    printf("\n A mensagem criptografada e :%s",crip_msg);
    }
    //Descrip
    else if(escolha == 2){
    printf("\n Digite mensagem a ser descriptografada:");

	for(i=0; i<tam_msg; i++)
	scanf("%c",&crip_msg[i]);

	tam_msg = strlen(crip_msg);
	for(i=0;i<tam_msg;i++)
    {
		msg = (int)(crip_msg[i] / 4);
	}
  
	printf("\n A mensagem descriptograda e:  %s",msg);
	}
getch();
return 0;
}