from django.urls import path
from . import views

urlpatterns = [
	path('index', views.index, name='index'),
	path('main', views.main, name='main'),
	path('cadastrar', views.cadastrar, name='cadastrar'),
	path('<int:receita_id>', views.receita, name='receita')
]