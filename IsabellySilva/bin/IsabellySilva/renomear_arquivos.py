import os
import glob
import sys

# --- 1. CONFIGURAÇÕES A SEREM AJUSTADAS ---

# O nome antigo a ser substituído (Ex: o nome da pasta do seu projeto)
NOME_ANTIGO = "ALV" 

# O novo nome que você quer usar (Ex: o nome do seu novo pacote/pasta)
NOVO_NOME = "ISD" 

# Filtro para os arquivos que você quer renomear
FILTRO = "*.class" 

# O nome deste script para que ele não tente renomear a si mesmo
NOME_SCRIPT = 'renomear_arquivos.py'

# ------------------------------------------

def main():
    print("\n************************************************")
    print("INICIANDO RENOMEAÇÃO DE ARQUIVOS")
    print(f"Renomeando de: '{NOME_ANTIGO}'")
    print(f"Para: '{NOVO_NOME}'")
    print("************************************************\n")

    # Obtém o diretório onde o script está salvo
    diretorio_atual = os.path.dirname(os.path.abspath(sys.argv[0]))
    arquivos_renomeados = 0

    # Itera sobre todos os arquivos que correspondem ao filtro na pasta atual
    padrao_busca = os.path.join(diretorio_atual, FILTRO)
    
    for caminho_antigo in glob.glob(padrao_busca):
        
        # Obtém apenas o nome do arquivo
        nome_arquivo = os.path.basename(caminho_antigo)
        
        # Ignora o próprio script e outros arquivos que não contêm o nome antigo
        if nome_arquivo == NOME_SCRIPT or NOME_ANTIGO not in nome_arquivo:
            continue
            
        try:
            # Cria o novo nome do arquivo
            nome_novo = nome_arquivo.replace(NOME_ANTIGO, NOVO_NOME)
            
            # Cria o caminho completo para o novo nome
            caminho_novo = os.path.join(diretorio_atual, nome_novo)
            
            # Renomeia o arquivo
            os.rename(caminho_antigo, caminho_novo)
            
            print(f" - [RENOMEADO] {nome_arquivo} -> {nome_novo}")
            arquivos_renomeados += 1
            
        except Exception as e:
            print(f" - [ERRO] Falha ao renomear {nome_arquivo}: {e}")
            
    print("\n************************************************")
    print(f"PROCESSO CONCLUÍDO. {arquivos_renomeados} arquivos renomeados.")
    print("************************************************")

if __name__ == "__main__":
    main()