from django.shortcuts import render, get_list_or_404, get_object_or_404
from.models import Receita

def index(request):
    return render(request, 'index.html')

def main(request):
    receitas = Receita.objects.all()

    dados = {
        'receitas':receitas
    }
    return render(request, 'main.html', dados)

def cadastrar(request):
    return render(request, 'cadastrar.html')


def receita(request, receita_id):
    receita = get_object_or_404(Receita, pk=receita_id)

    receita_a_exibir = {
        'receita': receita
    }
    return render(request, 'receita.html', receita_a_exibir)