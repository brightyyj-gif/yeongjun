export interface Project {
  id: string;
  title: string;
  subtitle: string;
  category: 'design-system' | 'web-app' | 'data-viz' | 'canvas';
  categoryLabel: string;
  year: string;
  period: string;
  role: string;
  team: string;
  image: string;
  summary: string;
  challenge: string;
  solution: string;
  impactMetrics: {
    label: string;
    value: string;
  }[];
  techStack: string[];
  features: string[];
  architectureSnippet?: string;
  githubUrl?: string;
  demoUrl?: string;
}

export interface Experience {
  id: string;
  company: string;
  role: string;
  period: string;
  location: string;
  description: string;
  achievements: string[];
  techStack: string[];
}

export interface SkillCategory {
  title: string;
  items: {
    name: string;
    level: string;
    description: string;
  }[];
}
