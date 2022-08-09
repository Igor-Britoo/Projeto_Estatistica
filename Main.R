
tabela = (read.table("repositorio.txt", header = TRUE, sep = ",", dec = "."))
tamanhoAmostra = nrow(tabela)

#IDADE/////////////////////////////////////////////////////////////////////
rolIdades = sort(tabela$Idade)
max(rolIdades) - min(rolIdades) #amplitude
mean(rolIdades) #media
quantile(rolIdades, 0.25) #quartil 1
quantile(rolIdades, 0.5) #quartil 2 (mediana)
quantile(rolIdades, 0.75) #quartil 3
print(table(rolIdades)) #frequencia absoluta
print(table(rolIdades)/tamanhoAmostra) #frequencia relativa
print(table(rolIdades)/tamanhoAmostra*100) #frequencia percentual
var(rolIdades)#variancia
sd(rolIdades)#desvio padrao

boxplot(tabela$Idade, main="Boxplot: Idade", col="darkblue")
histogramaIdades <-hist(tabela$Idade, col="darkblue", border="black", prob=FALSE, main="Histograma de Idades",
                          xlab="Idades", ylab="Densidade");

#SALARIO///////////////////////////////////////////////////////////////////
rolSalarios = sort(tabela$Salario)
max(rolSalarios) - min(rolSalarios) #amplitude
mean(rolSalarios) #media
quantile(rolSalarios, 0.25) #quartil 1
quantile(rolSalarios, 0.5) #quartil 2 (mediana)
quantile(rolSalarios, 0.75) #quartil 3
print(table(rolSalarios)) #frequencia absoluta
print(table(rolSalarios)/tamanhoAmostra) #frequencia relativa
print(table(rolSalarios)/tamanhoAmostra*100) #frequencia percentual
var(rolSalarios)#variancia
sd(rolSalarios)#desvio padrao

boxplot(tabela$Salario, main="Boxplot: Salario", col="darkblue")
histogramaSalarios <-hist(tabela$Salario, col="darkblue", border="black", prob=FALSE, main="Histograma de Salarios",
                       xlab="Salarios", ylab="Densidade");
xfit <- seq(min(tabela$Salario),max(tabela$Salario))
yfit <- dnorm(xfit,mean=mean(tabela$Salario),sd=sd(tabela$Salario))
yfit <- yfit*diff(histogramaSalarios$mids)*length(tabela$Salario)
lines(xfit, yfit, col="red", lwd=2)


#NUMERO DE VIAGENS AO EXTERIOR//////////////////////////////////////////////
rolNumViagens = sort(tabela$Num..Viagens.ao.Exterior)
max(rolNumViagens) - min(rolNumViagens) #amplitude
mean(rolNumViagens) #media
quantile(rolNumViagens, 0.25) #quartil 1
quantile(rolNumViagens, 0.5) #quartil 2 (mediana)
quantile(rolNumViagens, 0.75) #quartil 3
print(table(rolNumViagens)) #frequencia absoluta
print(table(rolNumViagens)/tamanhoAmostra) #frequencia relativa
print(table(rolNumViagens)/tamanhoAmostra*100) #frequencia percentual
var(rolNumViagens)#variancia
sd(rolNumViagens)#desvio padrao

boxplot(tabela$Num..Viagens.ao.Exterior, main="Boxplot: Num. Viagens ao Exterior", col="darkblue")

#NUMERO DE FILHOS//////////////////////////////////////////////////////////
rolNumFilhos = sort(tabela$Num.de.Filhos)
max(rolNumFilhos) - min(rolNumFilhos) #amplitude
mean(rolNumFilhos) #media
quantile(rolNumFilhos, 0.25) #quartil 1
quantile(rolNumFilhos, 0.5) #quartil 2 (mediana)
quantile(rolNumFilhos, 0.75) #quartil 3
print(table(rolNumFilhos)) #frequencia absoluta
print(table(rolNumFilhos)/tamanhoAmostra) #frequencia relativa
print(table(rolNumFilhos)/tamanhoAmostra*100) #frequencia percentual
var(rolNumFilhos)#variancia
sd(rolNumFilhos)#desvio padrao

boxplot(tabela$Num.de.Filhos, main="Boxplot: Num. Filhos", col="darkblue")
histogramaNumFilhos <-hist(tabela$Num.de.Filhos, col="darkblue", border="black", prob=FALSE, main="Histograma Num. Filhos",
                        xlab="Num. Filhos", ylab="Densidade");

#ALTURA////////////////////////////////////////////////////////////////////
rolAlturas = sort(tabela$Altura)
max(rolAlturas) - min(rolAlturas) #amplitude
mean(rolAlturas) #media
quantile(rolAlturas, 0.25) #quartil 1
quantile(rolAlturas, 0.5) #quartil 2 (mediana)
quantile(rolAlturas, 0.75) #quartil 3
print(table(rolAlturas)) #frequencia absoluta
print(table(rolAlturas)/tamanhoAmostra) #frequencia relativa
print(table(rolAlturas)/tamanhoAmostra*100) #frequencia percentual
var(rolAlturas)#variancia
sd(rolAlturas)#desvio padrao

boxplot(tabela$Altura, main="Boxplot: Altura", col="darkblue")

#PESO/////////////////////////////////////////////////////////////////////
rolPesos = sort(tabela$Altura)
max(rolPesos) - min(rolPesos) #amplitude
mean(rolPesos) #media
quantile(rolPesos, 0.25) #quartil 1
quantile(rolPesos, 0.5) #quartil 2 (mediana)
quantile(rolPesos, 0.75) #quartil 3
print(table(rolPesos)) #frequencia absoluta
print(table(rolPesos)/tamanhoAmostra) #frequencia relativa
print(table(rolPesos)/tamanhoAmostra*100) #frequencia percentual
var(rolPesos)#variancia
sd(rolPesos)#desvio padrao

boxplot(tabela$Peso, main="Boxplot: Peso", col="darkblue")

histogramaPesos <-hist(tabela$Peso, col="darkblue", border="black", prob=FALSE, main="Histograma de Pesos",
                  xlab="Pesos", ylab="Densidade");

#SEXO/////////////////////////////////////////////////////////////////////
print(table(tabela$Sexo)) #frequencia absoluta
print(table(tabela$Sexo)/tamanhoAmostra) #frequencia relativa
print(table(tabela$Sexo)/tamanhoAmostra*100) #frequencia percentual

barplot(table(tabela$Sexo), col="darkblue", border="black", main = "Grafico Sexos")
pie(table(tabela$Sexo))

#RACA/////////////////////////////////////////////////////////////////////
print(table(tabela$Raca)) #frequencia absoluta
print(table(tabela$Raca)/tamanhoAmostra) #frequencia relativa
print(table(tabela$Raca)/tamanhoAmostra*100) #frequencia percentual

barplot(table(tabela$Raca), col="darkblue", border="black", main = "Grafico Raças")
pie(table(tabela$Raca))

#ESCOLARIDADE/////////////////////////////////////////////////////////////
print(table(tabela$Escolaridade)) #frequencia absoluta
print(table(tabela$Escolaridade)/tamanhoAmostra) #frequencia relativa
print(table(tabela$Escolaridade)/tamanhoAmostra*100) #frequencia percentual

barplot(table(tabela$Escolaridade), col="darkblue", border="black", main = "Grafico Escolaridades")
pie(table(tabela$Escolaridade))

#PROFISSAO////////////////////////////////////////////////////////////////
print(table(tabela$Profissao)) #frequencia absoluta
print(table(tabela$Profissao)/tamanhoAmostra) #frequencia relativa
print(table(tabela$Profissao)/tamanhoAmostra*100) #frequencia percentual

pie(table(tabela$Profissao))


plot(tabela$Altura, tabela$Peso, main = "Dispersão Altura X Peso")

plot(tabela$Idade, tabela$Salario, main = "Dispersão Idade X Salario")

plot(tabela$Num..Viagens.ao.Exterior, tabela$Salario, main = "Dispersão Num. Viagens ao Exterior X Salario")

