from django.shortcuts import render

def index(request):
    return render(request, 'index.html')

def main(request):

    receitas = {
        1:'Lasanha',
        2:'Sopa de Legumes',
        3:'Sorvete',
        4:'Bolo de chocolate',
        5:'Bolo de cenoura',
        6:'Ficasse de frango'
    }

    dados = {
        'nome_das_receitas' : receitas
    }
    return render(request, 'main.html', dados)

def cadastrar(request):
    return render(request, 'cadastrar.html')